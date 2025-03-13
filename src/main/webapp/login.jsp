<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - SportFlow</title>
    <!-- Tailwind CSS CDN -->
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        /* Custom Animations */
        @keyframes slideIn {
            from { transform: translateY(20px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }
        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }
        .animate-slide-in { animation: slideIn 0.5s ease-out forwards; }
        .animate-fade-in { animation: fadeIn 0.8s ease-in forwards; }
        body {
            background: linear-gradient(135deg, #000000 0%, #1a1a1a 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .login-container {
            background: #000000;
            border: 3px solid #FFD700;
            border-radius: 15px;
            box-shadow: 0 0 25px rgba(255, 215, 0, 0.4);
            display: flex;
            overflow: hidden;
            max-width: 900px;
            width: 100%;
        }
        .form-section {
            padding: 2rem;
            width: 50%;
            color: #ffffff;
        }
        .image-section {
            width: 50%;
            background: #1a1a1a;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .login-image {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        input:focus {
            outline: none;
            border-color: #FFD700;
            box-shadow: 0 0 5px #FFD700;
        }
        .btn-gold {
            background: #FFD700;
            color: #000000;
            font-weight: bold;
            transition: background 0.3s ease;
        }
        .btn-gold:hover {
            background: #e6c200;
        }
        .btn-outline {
            border: 2px solid #FFD700;
            color: #FFD700;
            font-weight: bold;
            transition: all 0.3s ease;
        }
        .btn-outline:hover {
            background: #FFD700;
            color: #000000;
        }
    </style>
</head>
<body>
<div class="login-container">
    <!-- Form Section -->
    <div class="form-section">
        <h2 class="text-4xl font-bold text-center text-[#FFD700] mb-8 animate-slide-in">Login to SportFlow</h2>

        <% if (request.getAttribute("errorMessage") != null) { %>
        <p class="text-red-500 text-center mb-4 animate-pulse"><%= request.getAttribute("errorMessage") %></p>
        <% } %>

        <form action="Login" method="post" class="space-y-5">
            <!-- Username -->
            <div class="animate-slide-in" style="animation-delay: 0.1s;">
                <label for="email" class="block text-[#FFD700] font-semibold text-lg">Email</label>
                <input type="text" id="email" name="email" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>

            <!-- Password -->
            <div class="animate-slide-in" style="animation-delay: 0.2s;">
                <label for="password" class="block text-[#FFD700] font-semibold text-lg">Password</label>
                <input type="password" id="password" name="password" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>

            <!-- Buttons -->
            <div class="space-y-4">
                <div class="animate-slide-in" style="animation-delay: 0.3s;">
                    <input type="submit" value="Login" class="w-full p-3 btn-gold rounded-lg cursor-pointer">
                </div>
                <div class="flex justify-between animate-slide-in" style="animation-delay: 0.4s;">
                    <a href="index.jsp" class="w-1/2 mr-2 p-3 btn-outline text-center rounded-lg">Back to Home</a>
                    <a href="MainRegister.jsp" class="w-1/2 ml-2 p-3 btn-outline text-center rounded-lg">Register</a>
                </div>
            </div>
        </form>
    </div>

    <!-- Image Section -->
    <div class="image-section">
        <img src="https://i.pinimg.com/736x/45/18/8d/45188df79bc5081b47e9e97e009668c9.jpg"
             alt="Sports Login" class="login-image animate-fade-in">
    </div>
</div>
</body>
</html>