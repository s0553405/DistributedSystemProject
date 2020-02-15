# Verteilte-Systeme-Projekt 

von Susanne Schäfer, Sabrina Werner

# 1. Unsere Anwendung "Movie-Management-Tool"
### Beschreibung
Mit unserer Anwendung soll eine Nutzer seine bereits geschauten Filme verwalten können. Er erhält eine Übersicht und kann neue Filme hinzufügen. Außerdem kann er den jeweiligen Film bewerten.

## 2. Aufbau

### 2.1 Microservices
MovieService: Nutzer kann hier seine Filme verwalten, hinzufügen und löschen.
- H2 Database (jdbc:h2:mem:testdb) (befüllt mit Testdaten data.sql)
(Alternative zur implementierten MySQL DB, welche auf Windows10 und Docker Toolbox nicht zum laufen gebracht werden konnte)
- Stellt Filminformationen über einen API-Endpoint bereit
- Port 8083

RatingService: 
- MongoDB (Port 27017 / MyTestDb)
- Stellt Ratings über einen API-Endpoint bereit
- Port 8090

UserInterface: UI des Movie-Management-Tools. 
- Informationen zu Filmen kommen vom MovieService
- Ratings zu den Filmen vom RatingService.
- Spring Web und Thymeleaf 
- Port 8081

### 2.2 Infrastruktur
- Eureka (Servie-Discovery). Diese erkennt automatisiert laufende Microservices. 
- Port 8761 
- Config-Server. Speicherung der Config-Dateien an einem zentralen Ort für alle Services. (/configs) 
- Port 8888

### 2.3 Eureka Monitoring & Health Check
Eureka übeprüft automatisch ob ein Service gesund ist bzw. läuft.

### 2.4 Docker
Die einzelnen Services wurden dockerisiert für bessere Skalierbarkeit. 


### 3. Weitere Schritte zur Finalisierung des Verteilten Systems
1. UserInterface mit RatingService und MovieService verbinden. Für übersichtliche Darstellung und leichte Bedienbarkeit des Movie-Managements.
2. Docker-Compose/Cloud Foundry for Load Balancing 
3. Circuit-Breaker
