DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `product_id` int(4) NOT NULL,
  `title` varchar(100) NOT NULL,
  `description` varchar(300) NOT NULL,
  `urlimage` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);
ALTER TABLE `product`
  MODIFY `product_id` int(4) NOT NULL AUTO_INCREMENT;
COMMIT;


INSERT INTO `distributor` (`distributor_id`, `distributor_name`, `url_website`) 
VALUES (NULL, 'Luis Martinez', 'www.google.com');

INSERT INTO `distributor` (`distributor_id`, `distributor_name`, `url_website`) 
VALUES (NULL, 'Lola la bandida', 'https://getbootstrap.com');

INSERT INTO `distributor` (`distributor_id`, `distributor_name`, `url_website`) 
VALUES (NULL, 'Pepita', 'https://icons.getbootstrap.com');


INSERT INTO `product` (`product_id`, `title`, `description`, `urlimage`, `distributor_id`) 
VALUES (NULL, 'Cerveza negra imperial Bruder', 'Cerveza inspirada en una de las recetas más complejas de origen ruso tipo imperial stout', '/images/cerveza negra.jpg', 1);

INSERT INTO `product` (`product_id`, `title`, `description`, `urlimage`, `distributor_id`) 
VALUES (NULL, 'Cubeta de huevo', 'Cubeta de huevo criollo AAA', '/images/cubeta_huevo.png', 2);

INSERT INTO `product` (`product_id`, `title`, `description`, `urlimage`, `distributor_id`) 
VALUES (NULL, 'Manzana verde', 'Manzana verde chilena', '/images/manzana-verde.png', 3);

INSERT INTO `product` (`product_id`, `title`, `description`, `urlimage`, `distributor_id`) 
VALUES (NULL, 'Remolacha', 'Remolacha cultivada por campesinos de la región', '/images/remolacha.jpg', 3);

INSERT INTO `product` (`product_id`, `title`, `description`, `urlimage`, `distributor_id`) 
VALUES (NULL, 'Empanada vegetariana', 'Empanada de champiñones, pimentón, huevo y habichuela', '/images/emp-veg.jpg', 1);