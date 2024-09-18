CREATE SCHEMA `petlove`;

CREATE TABLE `petlove`.`usuarios`
(
    `id`         INT         NOT NULL AUTO_INCREMENT,
    `First_name` VARCHAR(20) NOT NULL,
    `Last_name`  VARCHAR(20) NOT NULL,
    `Age`        INT         NOT NULL,
    `Email`      VARCHAR(60) NOT NULL,
    `Whatsapp`   VARCHAR(14) NULL,
    `Addres`     VARCHAR(60) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `Email_UNIQUE` (`Email`)
);


CREATE TABLE `petlove`.`authentication`
(
    `id`         INT         NOT NULL AUTO_INCREMENT,
    `id_usuario` INT         NOT NULL,
    `usuario`    VARCHAR(20) NOT NULL,
    `password`   VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_usuario_auth`
        FOREIGN KEY (`id_usuario`)
            REFERENCES `petlove`.`usuarios` (`id`)
            ON DELETE CASCADE
);