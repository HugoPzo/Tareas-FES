import graphviz

# Crear el diagrama de estados

asm_diagram_custom = graphviz.Digraph(format="png")

# Agregar estados iniciales
asm_diagram_custom.node("S0", "Estado de Espera", shape="ellipse")

# Agregar procesos rectangulares
asm_diagram_custom.node("V1", "Verificar Entrada", shape="box")
asm_diagram_custom.node("V2", "Validar Datos", shape="box")

# Agregar decisiones en forma de rombo
asm_diagram_custom.node("D1", "Tipo de Acceso?", shape="diamond")

# Agregar estados intermedios y finales
asm_diagram_custom.node("S1", "Verificación Biométrica", shape="ellipse")
asm_diagram_custom.node("S2", "Verificación de PIN", shape="ellipse")
asm_diagram_custom.node("S3", "Verificación Bluetooth", shape="ellipse")
asm_diagram_custom.node("S4", "Apertura Mecánica", shape="ellipse")
asm_diagram_custom.node("S5", "Apertura Autorizada", shape="box")
asm_diagram_custom.node("S6", "Intento Fallido", shape="ellipse")
asm_diagram_custom.node("S7", "Bloqueo de Seguridad", shape="ellipse")

# Conectar los nodos en formato similar al de la imagen
asm_diagram_custom.edge("S0", "V1")
asm_diagram_custom.edge("V1", "D1")

# Decisiones basadas en el tipo de acceso
asm_diagram_custom.edge("D1", "S1", label="Biometría")
asm_diagram_custom.edge("D1", "S2", label="PIN")
asm_diagram_custom.edge("D1", "S3", label="Bluetooth")
asm_diagram_custom.edge("D1", "S4", label="Llave Mecánica")

# Flujo hacia validación
asm_diagram_custom.edge("S1", "V2")
asm_diagram_custom.edge("S2", "V2")
asm_diagram_custom.edge("S3", "V2")

# Validaciones exitosas y fallidas
asm_diagram_custom.edge("V2", "S5", label="Correcto")
asm_diagram_custom.edge("V2", "S6", label="Incorrecto")

# Manejo de intentos fallidos
asm_diagram_custom.edge("S6", "S7", label="Intentos excedidos")
asm_diagram_custom.edge("S7", "S0", label="Tiempo cumplido / Reset")

# Renderizar y mostrar el diagrama
asm_diagram_custom_path = "/home/hugo/Documentos/Tareas-FES/SEMESTRE VI/SISTEMAS_DIGITALES/TAREAS/diagrama_asm.py"
asm_diagram_custom.render(asm_diagram_custom_path)

asm_diagram_custom_path + ".png"


# digraph {
# 	S0 [label="Estado de Espera" shape=ellipse]
# 	V1 [label="Verificar Entrada" shape=box]
# 	V2 [label="Validar Datos" shape=box]
# 	D1 [label="Tipo de Acceso?" shape=diamond]
# 	S1 [label="Verificación Biométrica" shape=ellipse]
# 	S2 [label="Verificación de PIN" shape=ellipse]
# 	S3 [label="Verificación Bluetooth" shape=ellipse]
# 	S4 [label="Apertura Mecánica" shape=ellipse]
# 	S5 [label="Apertura Autorizada" shape=box]
# 	S6 [label="Intento Fallido" shape=ellipse]
# 	S7 [label="Bloqueo de Seguridad" shape=ellipse]
# 	S0 -> V1
# 	V1 -> D1
# 	D1 -> S1 [label="Biometría"]
# 	D1 -> S2 [label=PIN]
# 	D1 -> S3 [label=Bluetooth]
# 	D1 -> S4 [label="Llave Mecánica"]
# 	S1 -> V2
# 	S2 -> V2
# 	S3 -> V2
# 	V2 -> S5 [label=Correcto]
# 	V2 -> S6 [label=Incorrecto]
# 	S6 -> S7 [label="Intentos excedidos"]
# 	S7 -> S0 [label="Tiempo cumplido / Reset"]
# }
