# Factory Pattern - Guia de Practica

## Part 3

Vamos a aplicar la estructura de tus filminas tal cual:

- El Creator (abstracto) declara un factoryMethod() que devuelve un Product. 
- Los ConcreteCreators lo sobrescriben para devolver un ConcreteProduct específico. 
- El Creator también tiene una operación de negocio (someOperation()) que usa el factory method sin conocer el tipo concreto.

#### Tu tarea

1. Crear la interfaz Notification con un método send().
1. Hacer que EmailNotification, SMSNotification y PushNotification la implementen. (Casi no cambian — ya tienen send().)
1. Convertir NotificationService en una clase abstracta con:
   2. Un método abstracto createNotification(destinatario, mensaje): Notification ← este es el factory method. 
   3. Un método concreto sendNotification(mensaje, destinatario) que llama a createNotification(...) y después hace .send() sobre el resultado. 
   Atención: este método ya NO tiene if/else y ya NO menciona ninguna clase concreta.

1. Crear tres subclases: EmailNotificationService, SMSNotificationService, PushNotificationService. Cada una sobrescribe createNotification(...) para devolver su producto concreto.

#### Dos preguntas para tener en mente mientras codeás

1. ¿Dónde vive ahora la decisión de "qué tipo de notificación"? ¿Sigue adentro de sendNotification?
2. Para agregar WhatsApp, ¿qué necesitás hacer? ¿Cuántas clases existentes tenés que modificar vs. cuántas agregás?