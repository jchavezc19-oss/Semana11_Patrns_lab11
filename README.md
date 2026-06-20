# Práctica 010: Patrón Decorator

**Estudiante:** Chavez Castillo Jorge Leonardo  
**Curso:** Patrones de Diseño de Software  

---

## 📐 Resultados Analíticos (Casos A al D)

### Caso A: Café expreso con leche, soya, crema y moca
* **Estructura:** `Moca -> Crema -> Soya -> Leche -> Expreso`
* **Cálculo:** 1.99 + 0.10 + 0.15 + 0.10 + 0.20 = **$2.54**

### Caso B: Café descafeinado con doble moca, soya y leche
* **Estructura:** `Leche -> Soya -> Moca -> Moca -> Descafeinado`
* **Cálculo:** 1.05 + 0.20 + 0.20 + 0.15 + 0.10 = **$1.70**

### Caso C: Café batido con doble crema, doble leche, doble soya y doble moca
* **Estructura:** `Moca x2 -> Soya x2 -> Leche x2 -> Crema x2 -> Batido`
* **Cálculo:** 0.89 + 2(0.10) + 2(0.10) + 2(0.15) + 2(0.20) = **$1.99**

### Caso D: Café tostado negro con doble crema y triple soya
* **Estructura:** `Soya x3 -> Crema x2 -> TostadoNegro`
* **Cálculo:** 0.99 + 2(0.10) + 3(0.15) = **$1.64**