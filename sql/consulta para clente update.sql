UPDATE cliente
INNER JOIN usuario ON cliente.id_Usuario = usuario.idUsuario
SET cliente.RutCliente = "6666",
    cliente.Nombres = "pepe",
    cliente.Apellidos = "heyman",
    cliente.telefono = "556546545",
    cliente.Afp = '1',
    cliente.SistemaDeSalud = '1',
    cliente.Direccion ="direcccion",
    cliente.Comuna = "comuna",
    cliente.Edad = '99',
    usuario.userName = "usuariocliente",
    usuario.fNacimiento = '2001/12/12',
    usuario.run ="7777"
WHERE cliente.id_Usuario = "2" AND cliente.RutCliente = "11111112";


UPDATE cliente
INNER JOIN usuario ON cliente.id_Usuario = usuario.idUsuario
SET cliente.RutCliente = ?,
    cliente.Nombres = ?,
    cliente.Apellidos = ?,
    cliente.telefono = ?,
    cliente.Afp = ?,
    cliente.SistemaDeSalud = ?,
    cliente.Direccion =?,
    cliente.Comuna = ?,
    cliente.Edad = ?,
    usuario.userName = ?,
    usuario.fNacimiento = ?,
    usuario.run =?
WHERE cliente.id_Usuario = ? AND cliente.RutCliente = ?;
