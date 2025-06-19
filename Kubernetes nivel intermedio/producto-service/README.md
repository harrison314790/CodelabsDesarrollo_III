## Clean Architecture en Microservicios - Preguntas Clave

### 1. ¿Propósito principal de Clean Architecture?
Organizar el código para que sea independiente de frameworks UI y bases de datos.

### 2. ¿Beneficios en un microservicio con Spring Boot?
Mejora mantenibilidad, testabilidad y flexibilidad para migrar el proyecto a otra tecnologia.

### 3. ¿Capas principales y sus responsabilidades?
- **Domain**: Lógica de negocio pura.
- **Aplication**: Coordina casos de uso.
- **Infrastructure**: Implementaciones técnicas (BD, APIs externas).
- **Entrada/Salida_Delivery**: Interfaces como APIs o UI.

### 4. ¿Por qué desacoplar lógica de negocio de infraestructura?
Para que el negocio no dependa de tecnologías y sea más fácil de probar/modificar.

### 5. ¿Rol de la capa de aplicación?
Coordinar flujos de negocio (casos de uso), sin contener reglas de negocio.

### 6. ¿Diferencia entre UseCase y Service?
- **UseCase**: Se separan los casos de uso en la capa de aplicación (ListarProductosUseCase).
- **Service**: El servicio (ProductoService) combinaba lógica de negocio y casos de uso.

### 7. ¿Por qué definir Repositories como interfaces en el dominio?
Para mantener el dominio agnóstico de la base de datos y permitir múltiples implementaciones.

### 8. ¿Cómo implementar un UseCase en Spring Boot?
Como `@Service` o `@Component`; ventajas: claridad, reutilización y fácil testing.

### 9. ¿Problemas sin Clean Architecture en microservicios?
Código acoplado, difícil de mantener, baja testabilidad y problemas al escalar.

### 10. ¿Cómo facilita escalabilidad y mantenibilidad?
Permite modificar/escalar componentes sin afectar otros, gracias al desacoplamiento.  