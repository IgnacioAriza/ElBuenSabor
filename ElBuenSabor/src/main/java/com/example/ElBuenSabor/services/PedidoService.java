package com.example.ElBuenSabor.services;

import com.example.ElBuenSabor.entities.DetallePedido;
import com.example.ElBuenSabor.entities.Pedido;
import com.example.ElBuenSabor.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long>{

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;

    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }

    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception {
        try{

            List<DetallePedido> detallePedidos = detallePedidoService.listarPorPedido(pedido.getId());
            Double total = 0.0;

            if (detallePedidos != null && !detallePedidos.isEmpty()) {
                total = detallePedidos.stream()
                        .mapToDouble(detalle -> detalle.getSubTotal())
                        .sum();
            }

            pedido.setTotal(total);
            return pedidoRepository.save(pedido);

        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try{
            calcularTotal(pedido);
            return pedidoRepository.save(pedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Pedido> getPedidoByClienteId(Long clientesId) throws Exception{
        try {
            return pedidoRepository.getPedidoByClienteId(clientesId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> getPedidoByEmpleadoId(Long empleadosId) throws Exception{
        try {
            return pedidoRepository.getPedidoByEmpleadoId(empleadosId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> getPedidoBySucursalId(Long sucursalesId) throws Exception{
        try {
            return pedidoRepository.getPedidoBySucursalId(sucursalesId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
