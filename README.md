# Práctica 010: Patrón de Diseño Decorator

**Estudiante:** Chavez Castillo Jorge Leonardo  
**Institución:** Universidad Privada Antenor Orrego (UPAO)  
**Curso:** Patrones de Diseño de Software  

---

## 📐 Esquemas de Dependencia y Resultados (Puntos A al D)

A continuación se detalla el orden de envoltura recursiva (efecto de muñeca rusa) y el cálculo de costos para cada uno de los casos propuestos en la guía de práctica:

### Caso A: Café expreso con leche, soya, crema y moca
* **Estructura de Dependencia:** `Moca -> Crema -> Soya -> Leche -> Expreso`
* **Desglose de Costos:** 1.99 (Expreso) + 0.10 (Leche) + 0.15 (Soya) + 0.10 (Crema) + 0.20 (Moca)
* **Costo Total Final:** **$2.54**

### Caso B: Café descafeinado con doble moca, soya y leche
* **Estructura de Dependencia:** `Leche -> Soya -> Moca -> Moca -> Descafeinado`
* **Desglose de Costos:** 1.05 (Descafeinado) + 0.20 (Moca) + 0.20 (Moca) + 0.15 (Soya) + 0.10 (Leche)
* **Costo Total Final:** **$1.70**

### Caso C: Café batido con doble crema, doble leche, doble soya y doble moca
* **Estructura de Dependencia:** `Moca -> Moca -> Soya -> Soya -> Leche -> Leche -> Crema -> Crema -> Batido`
* **Desglose de Costos:** 0.89 + 2(0.10) + 2(0.10) + 2(0.15) + 2(0.20)
* **Costo Total Final:** **$1.99**

### Caso D: Café tostado negro con doble crema y triple soya
* **Estructura de Dependencia:** `Soya -> Soya -> Soya -> Crema -> Crema -> TostadoNegro`
* **Desglose de Costos:** 0.99 + 2(0.10) + 3(0.15)
* **Costo Total Final:** **$1.64**