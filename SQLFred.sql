CREATE OR ALTE TRIGGER Controle
ON
    Cadfun
FOR
    INSERT, UPDATE, DELETE
AS
    SELECT * FROM Cadfun;

CREATE TRIGGER mensagemI
ON
    Cadfun
FOR
    INSERT
AS
    PRINT 'Inserido com sucesso';

CREATE TRIGGER mensagemU
ON
    Cadfun
FOR
    UPDATE
AS
    PRINT "Registro alterado com sucesso!"

INSERT INTO Cadfun
VALUES (99,'Teste','99','Testador',9999,99);