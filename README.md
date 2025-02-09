# Real-Time Chat Application (Spring Boot + WebSockets)

This is a simple real-time chat application built using Spring Boot, WebSockets, and STOMP for real-time communication between users.

## Features
- Real-time messaging using WebSockets
- Multiple users can chat simultaneously
- Simple and clean UI with Bootstrap
- Frontend: HTML, JavaScript, Bootstrap
- Backend: Spring Boot, WebSocket, STOMP

## Project Structure
chat-app/
│── src/
│   ├── main/java/com/example/chat/
│   │   ├── config/            # WebSocket Configurations
│   │   ├── controller/        # Handles WebSocket Messages
│   │   ├── model/             # Message Model
│   │   ├── ChatApplication.java  # Main Spring Boot App
│   ├── main/resources/templates/
│   │   ├── chat.html          # Chat UI
│── pom.xml                    # Dependencies (Spring Boot, WebSockets)
│── README.md                  # Project Documentation

## How to Use
1. Open http://localhost:8080/chat in multiple browser tabs.
2. Enter your name and message.
3. Click "Send" to send the message.
4. Messages will appear in the chatbox in real-time.

## Technologies Used
- Spring Boot (Java) - Backend
- WebSockets + STOMP - Real-time communication
- SockJS + STOMP.js - WebSocket client-side handling
- HTML, JavaScript, Bootstrap - Frontend UI

## WebSocket Flow Diagram
Client ----(WebSocket)----> Spring Boot Server ----(Broadcast)----> Other Clients

1. User connects to WebSocket (/chat).
2. Messages are sent via STOMP to /app/sendMessage.
3. Server broadcasts the message to /topic/messages.
4. All connected users receive the message in real-time.

## Future Enhancements
- User authentication (Login system)
- Private chat rooms
- Message persistence (Save messages in database)
- Typing indicators

## License
This project is licensed under the MIT License.

Have suggestions or improvements? Feel free to contribute!
