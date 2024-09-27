CREATE SCHEMA `petlove`;

CREATE TABLE `petlove`.`usuarios`
(
    `id`         INT         NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL,
    `age`        INT         NOT NULL,
    `email`      VARCHAR(60) NOT NULL,
    `whatsapp`   VARCHAR(14) NULL,
    `addres`     VARCHAR(60) NULL,
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

CREATE TABLE `petlove`.`pets`
(
    `id`         INT         NOT NULL AUTO_INCREMENT,
    `id_usuario` INT         NOT NULL,
    `name`       VARCHAR(45) NOT NULL,
    `age`        INT         NOT NULL,
    `type`       VARCHAR(15) NOT NULL,
    `condition`  TINYINT     NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_usuario_pet`
        FOREIGN KEY (`id_usuario`)
            REFERENCES `petlove`.`usuarios` (`id`)
            ON DELETE CASCADE
);
CREATE TABLE `petlove`.`health`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_pet` INT NOT NULL,
    `life` INT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_pet_health`
        FOREIGN KEY (`id_pet`)
            REFERENCES `petlove`.`pets` (`id`)
            ON DELETE CASCADE
);


CREATE TABLE `petlove`.`needs`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_pet` INT NOT NULL,
    `urine` INT NULL,
    `faces` INT NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_pet_health`
        FOREIGN KEY (`id_pet`)
            REFERENCES `petlove`.`pets` (`id`)
            ON DELETE CASCADE
);
