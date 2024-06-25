package com.example.ElBuenSabor;

import com.example.ElBuenSabor.entities.*;
import com.example.ElBuenSabor.entities.enums.*;
import com.example.ElBuenSabor.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class ElBuenSaborApplication {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private PaisRepository paisRepository;
	@Autowired
	private ProvinciaRepository provinciaRepository;
	@Autowired
	private LocalidadRepository localidadRepository;
	@Autowired
	private DomicilioRepository domicilioRepository;
	@Autowired
	private EmpresaRepository empresaRepository;
	@Autowired
	private SucursalRepository sucursalRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private DetallePedidoRepository detallePedidoRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private PromocionRepository promocionRepository;
	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;
	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;
	@Autowired
	private ArticuloManufacturadoRepository articuloManufacturadoRepository;
	@Autowired
	private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
	@Autowired
	private PromocionDetalleRepository promocionDetalleRepository;
	@Autowired
	private ImagenEmpleadoRepository imagenEmpleadoRepository;
	@Autowired
	private UsuarioEmpleadoRepository usuarioEmpleadoRepository;
	@Autowired
	private ImagenClienteRepository imagenClienteRepository;
	@Autowired
	private UsuarioClienteRepository usuarioClienteRepository;
	@Autowired
	private ImagenPromocionRepository imagenPromocionRepository;
	@Autowired
	private ImagenArticuloRepository imagenArticuloRepository;
	@Autowired
	private FacturaRepository facturaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ElBuenSaborApplication.class, args);
		System.out.println("Servidor iniciado.");
	}

	@Bean
	@Transactional
	CommandLineRunner init(EmpleadoRepository empleadoRepository,
						   ClienteRepository clienteRepository,
						   PaisRepository paisRepository,
						   ProvinciaRepository provinciaRepository,
						   LocalidadRepository localidadRepository,
						   DomicilioRepository domicilioRepository,
						   EmpresaRepository empresaRepository,
						   SucursalRepository sucursalRepository,
						   PedidoRepository pedidoRepository,
						   DetallePedidoRepository detallePedidoRepository,
						   CategoriaRepository categoriaRepository,
						   PromocionRepository promocionRepository,
						   UnidadMedidaRepository unidadMedidaRepository,
						   ArticuloInsumoRepository articuloInsumoRepository,
						   ArticuloManufacturadoRepository articuloManufacturadoRepository,
						   ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository,
						   PromocionDetalleRepository promocionDetalleRepository,
						   ImagenEmpleadoRepository imagenEmpleadoRepository,
						   UsuarioEmpleadoRepository usuarioEmpleadoRepository,
						   ImagenClienteRepository imagenClienteRepository,
						   UsuarioClienteRepository usuarioClienteRepository,
						   ImagenPromocionRepository imagenPromocionRepository,
						   ImagenArticuloRepository imagenArticuloRepository,
						   FacturaRepository facturaRepository){
		return args -> {

			Pais pais1 = Pais.builder()
					.nombre("Inglaterra")
					.build();
			paisRepository.save(pais1);

			Provincia prov1 = Provincia.builder()
					.nombre("Londres")
					.pais(pais1)
					.build();
			provinciaRepository.save(prov1);

			Localidad loc1 = Localidad.builder()
					.nombre("Kennington")
					.provincia(prov1)
					.build();
			localidadRepository.save(loc1);

			Domicilio dom1 = Domicilio.builder()
					.calle("Harleyford Road")
					.numero(19)
					.cp(1234)
					.localidad(loc1)
					.build();
			domicilioRepository.save(dom1);
			Domicilio dom2 = Domicilio.builder()
					.calle("Atlantic Road")
					.numero(389)
					.cp(5678)
					.localidad(loc1)
					.build();
			domicilioRepository.save(dom2);

			Empresa empr1 = Empresa.builder()
					.razonSocial("Magnus S.A")
					.nombre("The Magnus Institute")
					.cuil(12334555)
					.build();
			empresaRepository.save(empr1);

			Sucursal suc1 = Sucursal.builder()
					.nombre("The Archives")
					.casaMatriz(Boolean.FALSE)
					.domicilio(dom1)
					.horarioApertura(LocalTime.of(8,30))
					.horarioCierre(LocalTime.of(20,30))
					.empresa(empr1)
					.build();
			sucursalRepository.save(suc1);

			ImagenEmpleado ime1 = ImagenEmpleado.builder()
					.denominacion("Imagen 1")
					.build();
			imagenEmpleadoRepository.save(ime1);

			UsuarioEmpleado use1 = UsuarioEmpleado.builder()
					.auth0Id("readin123")
					.username("simms88")
					.build();
			usuarioEmpleadoRepository.save(use1);

			Empleado em1 = Empleado.builder()
					.sucursal(suc1)
					.build();
			em1.setNombre("Jonathan");
			em1.setApellido("Simms");
			em1.setTelefono("5668800");
			em1.setEmail("watcher@gmail.com");
			em1.setFechaNacimiento(LocalDate.of(1988,10,31));
			em1.setImagenEmpleado(ime1);
			em1.setUsuarioEmpleado(use1);
			em1.setRol(Rol.ADMINISTRADOR);
			empleadoRepository.save(em1);

			ImagenCliente imc1 = ImagenCliente.builder()
					.denominacion("Imagen 2")
					.build();
			imagenClienteRepository.save(imc1);

			UsuarioCliente usc1 = UsuarioCliente.builder()
					.auth0Id("enjoy99")
					.username("skyblue")
					.build();
			usuarioClienteRepository.save(usc1);

			Cliente cli1 = Cliente.builder().build();
			cli1.setNombre("Simon");
			cli1.setApellido("Fairchild");
			cli1.setTelefono("601334");
			cli1.setEmail("fairchildllc@gmail.com");
			cli1.setFechaNacimiento(LocalDate.of(1789,3,14));
			cli1.setImagenCliente(imc1);
			cli1.setUsuarioCliente(usc1);
			cli1.setRol(Rol.CLIENTE);
			cli1.getDomicilios().add(dom1);
			cli1.getDomicilios().add(dom2);
			clienteRepository.save(cli1);

			Pedido ped1 = Pedido.builder()
					.fechaPedido(LocalDate.of(2023,05,23))
					.sucursal(suc1).cliente(cli1)
					.empleado(em1).total(250.5)
					.estado(Estado.PENDIENTE)
					.formaPago(FormaPago.EFECTIVO)
					.horaEstimadaFinalizacion(LocalTime.of(12,55))
					.tipoEnvio(TipoEnvio.DELIVERY)
					.totalCosto(170.0)
					.build();
			pedidoRepository.save(ped1);

			DetallePedido detPed1 = DetallePedido.builder()
					.pedido(ped1)
					.cantidad(5)
					.subTotal(450.5)
					.build();
			detallePedidoRepository.save(detPed1);

			DetallePedido detPed2 = DetallePedido.builder()
					.pedido(ped1)
					.cantidad(2)
					.subTotal(300.0)
					.build();
			detallePedidoRepository.save(detPed2);

			Categoria cat1 = Categoria.builder()
					.denominacion("Categoria 1")
					.build();
			categoriaRepository.save(cat1);

			Categoria subCat1 = Categoria.builder()
					.denominacion("Subcategoria 1")
					.categoriaPadre(cat1)
					.build();
			categoriaRepository.save(subCat1);

			Categoria subCat2 = Categoria.builder()
					.denominacion("Subcategoria 2")
					.categoriaPadre(cat1)
					.build();
			categoriaRepository.save(subCat2);

			cat1.getSubcategorias().add(subCat1);
			cat1.getSubcategorias().add(subCat2);
			categoriaRepository.save(cat1);

			suc1.getCategorias().add(cat1);

			ImagenPromocion imp1 = ImagenPromocion.builder()
					.denominacion("Imagen 3")
					.build();
			imagenPromocionRepository.save(imp1);
			ImagenPromocion imp2 = ImagenPromocion.builder()
					.denominacion("Imagen 4")
					.build();
			imagenPromocionRepository.save(imp2);

			Promocion prom1 = Promocion.builder()
					.denominacion("Promocion 1")
					.descripcionDescuento("10% de descuento")
					.fechaDesde(LocalDate.of(2024,06,12))
					.fechaHasta(LocalDate.of(2024, 06, 25))
					.horaDesde(LocalTime.of(20,30))
					.horaHasta(LocalTime.of(23,30))
					.precioPromocional(2500.5)
					.tipoPromocion(TipoPromocion.HAPPYHOUR)
					.build();
			prom1.getImagenPromocion().add(imp1);
			promocionRepository.save(prom1);
			Promocion prom2 = Promocion.builder()
					.denominacion("Promocion 2")
					.descripcionDescuento("15% de descuento")
					.fechaDesde(LocalDate.of(2024,06,12))
					.fechaHasta(LocalDate.of(2024, 06, 25))
					.horaDesde(LocalTime.of(11,30))
					.horaHasta(LocalTime.of(14,30))
					.precioPromocional(3000.0)
					.tipoPromocion(TipoPromocion.HAPPYHOUR)
					.build();
			prom2.getImagenPromocion().add(imp2);
			promocionRepository.save(prom2);

			suc1.getPromociones().add(prom1);
			suc1.getPromociones().add(prom2);
			sucursalRepository.save(suc1);

			PromocionDetalle prd1 = PromocionDetalle.builder()
					.cantidad(320)
					.build();
			promocionDetalleRepository.save(prd1);

			UnidadMedida unMedida = UnidadMedida.builder()
					.denominacion("Unidad de medida 1")
					.build();
			unidadMedidaRepository.save(unMedida);

			ImagenArticulo ima1 = ImagenArticulo.builder()
					.denominacion("Imagen Articulo 1")
					.build();
			imagenArticuloRepository.save(ima1);

			ImagenArticulo ima2 = ImagenArticulo.builder()
					.denominacion("Imagen Articulo 2")
					.build();
			imagenArticuloRepository.save(ima2);

			ArticuloInsumo artInsumo1 = ArticuloInsumo.builder()
					.precioVenta(230.0)
					.precioCompra(460.5)
					.stockActual(36)
					.stockMaximo(150)
					.esParaElaborar(Boolean.TRUE)
					.categoria(cat1)
					.unidadMedida(unMedida)
					.build();
			artInsumo1.getImagenArticulo().add(ima1);
			articuloInsumoRepository.save(artInsumo1);

			ArticuloManufacturado artManuf1 = ArticuloManufacturado.builder()
					.categoria(cat1)
					.precioVenta(140.5)
					.descripcion("Descripcion art manuf 1")
					.tiempoEstimadoMinutos(60)
					.preparacion("Preparacion art manuf 1")
					.unidadMedida(unMedida)
					.build();
			artManuf1.getImagenArticulo().add(ima2);
			articuloManufacturadoRepository.save(artManuf1);

			ArticuloManufacturadoDetalle artManufDet1 = ArticuloManufacturadoDetalle.builder()
					.cantidad(2)
					.articuloInsumo(artInsumo1)
					.articuloManufacturado(artManuf1)
					.build();
			articuloManufacturadoDetalleRepository.save(artManufDet1);

			Factura fac1 = Factura.builder()
					.fechaFacturacion(LocalDate.of(2020,10,31))
					.mpPaymentId(140)
					.mpMerchantOrderId(680)
					.mpPreferenceId("Preference Id 1")
					.mpPaymentType("Payment Type 1")
					.formaPago(FormaPago.EFECTIVO)
					.totalVenta(180.5)
					.build();
			facturaRepository.save(fac1);

		};
	}

}
