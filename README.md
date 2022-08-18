# APITEST
 Testapi springboot with swagger
 
 วิธีการรัน
 1.สร้างตัว DataBase ชื่อ ssotest โดยใช้ Program Postgresql
 2.สร้าง schema ชื่อ woohoo
 3.ทำการเชื่อมต่อ DataBase เข้ากับ project
 4.ทำการ run project แล้วเข้า http://localhost:8080/swagger-ui.html#/ เพื่อทำการทดสอบ
 5.คลิกที่ api-controller แล้วคลิกที่ method post
 6.กด Try it out แล้วทำการใส่ข้อมูลลงไป
 7.กด Execute ถ้าได้ respond 200 ก็คือทำการบันทึกข้อมูลลง DataBase แล้ว
