CREATE TABLE "CLIENT" (
    "ID" int(11) NOT NULL AUTO_INCREMENT,
    "LAST_NAME" VARCHAR(60) NOT NULL,
    "FIRST_NAME" VARCHAR(60) DEFAULT NULL,
    PRIMARY KEY ("ID")
);

CREATE TABLE "RESERVATION" (
    "NUMBER" INT(11) NOT NULL AUTO_INCREMENT,
    "FILM_NAME" VARCHAR(100) NOT NULL,
    "DATE" DATETIME NOT NULL,
    "SEAT" INT(5) NOT NULL,
    "PRICE" DECIMAL(18,2) NOT NULL,
    "CLIENT_ID" int(11) DEFAULT NULL,
    PRIMARY KEY ("NUMBER"),
    CONSTRAINT "FK_CLIENT_ID" FOREIGN KEY ("CLIENT_ID")
    REFERENCES "CLIENT" ("ID")
    ON DELETE RESTRICT
    ON UPDATE RESTRICT
);