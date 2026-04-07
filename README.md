# 🖥️ IT Asset Manager API

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.4-brightgreen?style=for-the-badge&logo=springboot)
![H2 Database](https://img.shields.io/badge/Database-H2-blue?style=for-the-badge&logo=databricks)

Sistema backend para la gestión y control de activos de TI (Laptops, Servidores, Periféricos). Diseñado con una arquitectura limpia y listo para ser consumido por cualquier aplicación frontend.

---

## 🚀 Características
* **Gestión de Inventario:** Registro completo de activos (Nombre, Serie, Tipo, Estado).
* **API RESTful:** Endpoints optimizados para consultas rápidas.
* **Base de Datos en Memoria:** Configuración ágil con H2 para desarrollo y pruebas.

---

## 📊 Endpoints de la API

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| **GET** | `/api/activos` | Obtiene la lista completa de activos en formato JSON. |

### Ejemplo de respuesta:
```json
[
  {
    "id": 1,
    "nombre": "MacBook Pro M3",
    "tipo": "Laptop",
    "serie": "APP987654",
    "estado": "Asignado",
    "asignadoA": "Alejandro Lopez"
  }
]



