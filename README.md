<<<<<<< HEAD
# Spring web 
### Một số nguyên tắc phát triển phần mềm
+ Tính tái sử dụng (Reusability)
+ Tính mở rộng (Scalability)
+ Phát triển theo hướng đối tượng (OOP - Object-Oriented Programming)
+ Phát triển ứng dụng Web theo mô hình MVC (Model-View-Controller)
+ Bảo mật và xác thực người dùng
### Cấu trúc mã:
+ Cấu trúc mã của ứng dụng được phân tách rõ ràng theo mô hình MVC, giúp tăng tính tổ chức và dễ bảo trì. Các lớp model chịu trách nhiệm dữ liệu, controller xử lý các yêu cầu từ người dùng, service chứa logic nghiệp vụ, và repository tương tác với cơ sở dữ liệu. Giao diện người dùng được hiển thị qua các file html.

### Mô tả:
+ Web Ecommerce bán sp Apple, đối tượng sd : quản lí, khách hàng,
trưng bày sản phẩm, tạo giỏ hàng, Đặt hàng

### Các bước để chạy chương trình:
+ Cài đặt JDK (Java Development Kit)
+ Tải và cài đặt một IDE như IntelliJ IDEA, Eclipse
+ Cài đặt MySQL
+ Khởi động dịch vụ MySQL và tạo cơ sở dữ liệu cần thiết cho ứng dụng.
+ Clone repo từ GitHub
+ Tạo cơ sở dữ liệu trong MySQL: Truy cập phpMyAdmin và tạo cơ sở dữ liệu (ví dụ: apple_store)
+ Cấu hình kết nối cơ sở dữ liệu trong file application.properties
+ Cài đặt các thư viện cần thiết trong file pom
+ Chạy ứng dụng
+ Sau khi ứng dụng đã được chạy, mở trình duyệt và truy cập vào địa chỉ: http://localhost:8080

### Chức năng của chương trình:
+ phân quyền admin, user
+ đăng nhập qua google 
+ quản lí sản phẩm, loại sản phẩm(CRUD)
+ xem sản phẩm, xem chi tiết
+ quản lí giỏ hàng (thêm, xóa)
+ Tìm kiếm sản phẩm theo tên
+ Phân trang

### Link video demo:
+ https://www.youtube.com/watch?v=SAj5oLv836U
=======
Hướng dẫn chạy lab2:
- clone về
- Sử dụng phpMyAdmin để tạo một database
- sử dụng lệnh mvn exec:java -Dexec.mainClass="org.example.Program" -Dexec.args="jdbc:mysql://localhost:your local host/your database?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true root ''" để chạy chương trình
>>>>>>> 07e607461b0a35c4ff9ef4ae029359c311750b6c
