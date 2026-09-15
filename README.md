
Cach chay

1. Config Server 8888
2. Eureka Server 8761
3. RoomType Service 8081
4. Room Service 8082
5. API Gateway 8080

Kiem tra Eureka
http://localhost:8761

API kiem thu qua Gateway

GET http://localhost:8080/api/roomtypes/1

GET http://localhost:8080/api/rooms

POST http://localhost:8080/api/rooms

{
"roomNumber": "102",
"name": "Phong 102",
"price": 3000000,
"roomTypeId": 1
}

POST http://localhost:8080/api/rooms

{
"roomNumber": "103",
"name": "Phong 103",
"price": 3000000,
"roomTypeId": 9999
}

Room Service su dung OpenFeign de kiem tra roomTypeId truoc khi luu.