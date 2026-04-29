# Ejercicio 2 — Abstract Factory

## 🎯 Paso 2: La curva — agregar familias de productos

### Preguntas para responder cuando me pegues el código

1. Dónde vive el conocimiento de qué clases son "familia Windows"? Solo en tu cabeza y en el switch. No está modelado en el código de ninguna forma verificable.
1. ¿Podés garantizar que nunca se mezclan familias leyendo el código de un compañero? No. Tenés que leer cada rama del switch manualmente y confiar en que no se equivocó.
1. ¿Cambiar el tema en runtime? Tendrías que llamar renderUI("Mac") de vuelta y volver a instanciar todo. No hay forma de decirle al objeto "ahora sos Mac" sin pasar por el switch de nuevo.
---