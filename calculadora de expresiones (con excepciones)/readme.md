# Calculadora de Expresiones

Una simple calculadora de expresiones matemáticas que evalúa expresiones numéricas con los operadores básicos `+`, `-`, `*` y `/`. Se practica el manejo de excepciones para errores de entrada y evaluación.

<p align="center">
  <img src="https://lh3.googleusercontent.com/fife/APg5EOalhpb3Irj0Re88D0lcqdeKdJ8xgLDHr0XrFxBldN6pQK8MG3T-rYjntzgXrXGaWkEzB7CfLR4YQbZ_8HSp7HKvFzCvS8ZLnrDtGyS43VBRruatJjPMUOG64E0G04OTS6e9R6U1ANBs9bG8EAcqFkwtCpq9d50O9qRw6IkzH_G21eWfZglMR6ps_JJa_MwToqR-8aAYsu_ukUl8ndEzyxqIobbulefsFbYji5xohwF3B8EKBsytrTrdWd6Zu5FmmwMbSF3rlC08kWESGCtue0ibLemAOtzjcszoTpeCY8a8REX5grlZb4KEwYpOHyNAzJXPMKeTgr4It7Fv2xsNvzZkgqq3YRZhN6yOdWC7_zb3goc351K1aKM8HdFqZ3oWrfG0XNl5rHKHiDG8JmmifeWdCGgu8OZdQtkz1Qf-gx6-xrbLPRrdT6FW5OT4Mhz7VyadNCzTLbMwIpB25OZURRCIaVp_rkiHPdEWf7zV3HQtmC_YzZ8AVL0N0IyEWQxgGCsvXgaQmM6mFuKpkumh0D9eSUvDrUisBkWIq_aa24mq05dOD0Bub9Q7dROflpvSZ_wVFtaaeOL83ECAEpciiZ5yI8cfr9rrQeGGJWU-AEn_s2VJ2fIQyaifSzpuDhOBFhNM61JrC6-HtWSJDremA8Vpwmcv-wqQEfLC6h2vkmS5jG3VOXbkI1KO1tmLo2Mvm3iC9slGD9A9_jMdYfI4MxLZj-3ji2rHkJJwKdRZetNDAodz8Sxpul0c4jOwlV2A1gWF2vNxSvtASyV2R6d0JD8RoHWn9DKEjNCmb1CrDvkAzSYeG5xfozpb_zGtf0DbIV09IfrKPcpx1PkYhaGe96730HksWdOMxFWy9pPjbwqCm4WlqSY0PMRiBVhci0QCDEBTE5okNtzMIKVnbb_AGnGonhMSgFF-oB_ozZ3IXtRsAvIXJtLBva0ZnBj4lriFuPVvhcmZdNR5_aQSmqNQVBSTEL4LThRIjFm8Mz2z6FlMk87ba-5Jv5_b-qUIgsyZ8YK0ZnGSWHKTgImtNoApL98al5h3tBfp09_eIjvbtyFDUq6fN49z5OkLH9Idd-J_FULHkYmIcjguUVWw7Jplvk-7STtcLIYoaB8GZ2AMaNNGGEKvIUs43EUhbKvm7agusoz8jm5xt24Uty8ocgAyuA0odlzDaXlVB8inhdE3sy4rry3ApR2eZfMvJACUL8VEVRYkeQaLEKNIMSuha7MbITPaZyp85pG9dPSsTDUazuFW_Ex3_i2F5MW2Q0LPtpXhgaV72-_t2Erd1Jj9_nfXUw7QCXPXeZY6RcrCnUtz6-qBKO2b9FnTHCC76KqlGSZCxq7XfI4U6H9RSZt2_bhb3Q4eEGTaG9nooQWvNQ58Md-Cgg-UF8h3BwHGNIY8loIl03MXNe_DnS4lG3NQkrkPEVnF4G9gICJloDy3uMVpkqvi6593rPJ0jCQ3iLTwDY6gvlbvcnRy4oJYtZCSgsxgR_lpfCojrrVnZ82oZ_1rhFK3cayW7Eo0wd30qUKY5kr7H1AlnxX37nISZehf1Yj0sUhVoJ4ubxp9sxcgDg=w1868-h903" alt="imagen de la calculadora">
</p>

## Estructura

1. `Elemento`: Clase abstracta base para los elementos de una expresión (números y operadores).
2. `Numero`: Extiende `Elemento` y representa un número en la expresión.
3. `Operador`: Extiende `Elemento` y representa un operador en la expresión.
4. `Expresion`: Contiene la lógica para analizar y evaluar una expresión matemática.
5. `InvalidCharException`: Excepción personalizada para caracteres inválidos en la entrada.
6. `EvaluationException`: Excepción personalizada para errores de evaluación (como división por cero).

Además, se incluye un GUI simple para interactuar con la calculadora:

1. `MainGUI`: Interfaz gráfica de usuario para la calculadora de expresiones.

## Uso

Se ingresa la expresión matemática en el campo de texto de la GUI y se presiona el botón "Calcular" para evaluar la expresión. La calculadora maneja errores en la entrada, como caracteres inválidos, y errores de evaluación, como la división por cero o una expresión incompleta.

El botón "Calcular" solo se activa cuando hay una expresión válida en el campo de texto.

## Excepciones

La calculadora maneja las siguientes excepciones:

1. `InvalidCharException`: Se lanza cuando se encuentra un caracter inválido en la entrada.
2. `EvaluationException`: Se lanza en caso de errores de evaluación, como la división por cero o una expresión incompleta.
