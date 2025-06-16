## ADD y Clean Architecture

### 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?
ADD es un enfoque para diseñar la arquitectura de software basado en atributos de calidad como rendimiento, seguridad o escalabilidad.

### 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?
ADD define la arquitectura con base en atributos de calidad, Clean Architecture estructura el codigo en capas desacopladas para implementarla.

### 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?
1. Identificar requisitos y atributos de calidad.  
2. Seleccionar tácticas arquitectónicas.  
3. Definir módulos y interacciones.  
4. Validar y ajustar la arquitectura.

### 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?
Se identifican a partir de los requisitos del sistema y son clave para guiar las decisiones arquitectónicas.

### 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?
Porque permite implementar la arquitectura definida en ADD con separación clara de responsabilidades y bajo acoplamiento.

### 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?
- Independencia de frameworks.  
- Separación de lógica de negocio e infraestructura .  
- Uso de interfaces para desacoplar dependencias.

### 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?
Traduciendo requisitos del negocio en atributos de calidad y tácticas específicas para cumplirlos.

### 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?
- Alta escalabilidad.  
- Mantenibilidad.  
- Independencia tecnológica .  
- Diseño enfocado en calidad desde el inicio.

### 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?
Mediante validaciones, pruebas de rendimiento y seguridad y revisiones arquitectónicas.

### 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?
- Pruebas de carga JMeter, k6.  
- Revisiones de arquitectura ATAM.  
- Análisis estático de código SonarQube.  
- Monitoreo de métricas Prometheus y Grafana.