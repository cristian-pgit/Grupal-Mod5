UPDATE usuario u
INNER JOIN profesional p ON u.idUsuario = p.id_Usuario
SET u.userName = "juan", u.fNacimiento = "2020/10/10", u.run = "2222",
    p.TituloProfesional = "titulazo", p.fechaIngreso = '2030/02/02', p.id_Profesional = "5"
WHERE u.idUsuario = "1" AND p.id_Profesional = "1"