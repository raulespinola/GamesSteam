/* User */

INSERT INTO User (id, creation_date, delete_date, edition_date, version, email, name, customer_id) VALUES 
(1, NULL, NULL, NULL, 1, 'Monchi', 'hola@gmail', NULL);

INSERT INTO User (id, creation_date, delete_date, edition_date, version, email, name, customer_id) VALUES 
(2, NULL, NULL, NULL, 1, 'Juancito', 'juan@gmail', NULL);

INSERT INTO User (id, creation_date, delete_date, edition_date, version, email, name, customer_id) VALUES 
(3, NULL, NULL, NULL, 1, 'Joseson', 'juan@gmail', NULL);



/* Description */
INSERT INTO DESCRIPTION (id, creation_date, delete_date, edition_date, version, mobiledescription, webdescription) VALUES 
(1, NULL, NULL, NULL, 1, 'Diablo 2 Mobile', 'Diablo 2 Web');

INSERT INTO DESCRIPTION (id, creation_date, delete_date, edition_date, version, mobiledescription, webdescription) VALUES 
(2, NULL, NULL, NULL, 1, 'Fallout Mobile', 'Fallout Web');

INSERT INTO DESCRIPTION (id, creation_date, delete_date, edition_date, version, mobiledescription, webdescription) VALUES 
(3, NULL, NULL, NULL, 1, 'Choose your destiny', 'Diablo Mod Exp Web');

INSERT INTO DESCRIPTION (id, creation_date, delete_date, edition_date, version, mobiledescription, webdescription) VALUES 
(4, NULL, NULL, NULL, 1, 'Las Vegas Mods', 'Las Vegas Mod Exp Web');


/* Games */

INSERT INTO GAME (id, creation_date, delete_date, edition_date, version, name, DESCRIPTION_ID) VALUES 
(1, NULL, NULL, NULL, 1, 'Diablo 2', 1);

INSERT INTO GAME (id, creation_date, delete_date, edition_date, version, name, DESCRIPTION_ID) VALUES 
(2, NULL, NULL, NULL, 1, 'Fallout', 2);


/* Mods */

INSERT INTO MOD (id, creation_date, delete_date, edition_date, version, name, DESCRIPTION_ID, GAME_ID) VALUES 
(1, NULL, NULL, NULL, 1, 'Destiny Fate', 3, 1);

INSERT INTO MOD (id, creation_date, delete_date, edition_date, version, name, DESCRIPTION_ID, GAME_ID) VALUES 
(2, NULL, NULL, NULL, 1, 'Las Vegas', 4, 2);


