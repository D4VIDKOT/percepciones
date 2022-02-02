DROP TABLE IF EXISTS `percepciones`;
CREATE TABLE `percepciones` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `cafe` varchar(100) NOT NULL,
  `percepcion` varchar(500) NOT NULL,
  `estado` varchar(100) NOT NULL
) ;