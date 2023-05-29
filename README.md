# PharosDBmapper
Pharos DBmapper will provide access to the Pharos Database exposing endpoints to execute CRUD operations and criteria based queries using Spring Boot.

## How to run this application locally? ##

1. Execute the /docker-compose.yaml file using the command:

```bash
docker-compose up
```

2. Create a Maven Configuration with the command:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

3. Add the environment variables to the previously created profile:
```bash
- env=val
```
4. Execute

## Physical model ##

![Pharos Model](Pharos-model.png)

## Endpoints exposed ##

### Health ###

| Endpoint      | GET | POST | PUT | DELETE | 🔒 |
|:--------------|:----|:-----|:----|:-------|:---|
| /api/health   | x   |      |     |        |    |
| /api/v1/login |     | x    |     |        |    |


### Address ###
| Endpoint                       | GET | POST | PUT | DELETE | 🔒 |
|:-------------------------------|:----|:-----|:----|:-------|:---|
| /api/v1/address/getAddress     | x   |      |     |        | x  |
| /api/v1/address/getAddressList |     | x    |     |        | x  |
| /api/v1/address/createAddress  |     | x    |     |        | x  |
| /api/v1/address/updateAddress  |     |      | x   |        | x  |
| /api/v1/address/deleteAddress  |     |      |     | x      | x  |

### Candidate ###
| Endpoint                             | GET | POST | PUT | DELETE | 🔒 |
|:-------------------------------------|:----|:-----|:----|:-------|:---|
| /api/v1/candidate/getCandidate       | x   |      |     |        | x  |
| /api/v1/candidate/getCandidatesList  |     | x    |     |        | x  |
| /api/v1/candidate/createCandidate    |     | x    |     |        | x  |
| /api/v1/candidate/updateCandidate    |     |      | x   |        | x  |
| /api/v1/candidate/deleteCandidate    |     |      |     | x      | x  |

### Document ###
| Endpoint                             | GET | POST | PUT | DELETE | 🔒 |
|:-------------------------------------|:----|:-----|:----|:-------|:---|
| /api/v1/document/getCandidate        | x   |      |     |        | x  |
| /api/v1/document/getCandidatesList   |     | x    |     |        | x  |
| /api/v1/document/createCandidate     |     | x    |     |        | x  |
| /api/v1/document/updateCandidate     |     |      | x   |        | x  |
| /api/v1/document/deleteCandidate     |     |      |     | x      | x  |

### Password ###
| Endpoint                             | GET | POST | PUT | DELETE | 🔒 |
|:-------------------------------------|:----|:-----|:----|:-------|:---|
| /api/v1/password/getCurrentPassword  | x   |      |     |        | x  |
| /api/v1/password/getCandidatesList   |     | x    |     |        | x  |
| /api/v1/password/createPassword      |     | x    |     |        | x  |
| /api/v1/password/updateCandidate     |     |      | x   |        | x  |
| /api/v1/password/deleteCandidate     |     |      |     | x      | x  |