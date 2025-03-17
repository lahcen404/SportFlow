<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SportFlow - Edit Member</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        @keyframes fadeIn { from { opacity: 0; } to { opacity: 1; } }
        @keyframes bounceIn { 0% { transform: scale(0.8); opacity: 0; } 60% { transform: scale(1.05); opacity: 1; } 100% { transform: scale(1); } }
        @keyframes rotateBorder { 0% { border-color: #FFD700; } 50% { border-color: #e6c200; } 100% { border-color: #FFD700; } }
        body {
            background: linear-gradient(135deg, rgba(0, 0, 0, 0.7), rgba(26, 26, 26, 0.7)),
            url('https://i.pinimg.com/736x/1e/da/48/1eda480b629bcf0bc36fa2c53404b089.jpg') no-repeat center center fixed;
            background-size: cover;
            color: #ffffff;
            font-family: 'Arial', sans-serif;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
        .navbar { background: #000000; border-bottom: 4px solid transparent; border-image: linear-gradient(to right, #FFD700, #e6c200) 1; box-shadow: 0 4px 15px rgba(255, 215, 0, 0.2); }
        .nav-link { transition: color 0.3s ease; }
        .nav-link:hover { color: #e6c200; }
        .form-container { background: rgba(0, 0, 0, 0.8); border: 2px solid #FFD700; border-radius: 10px; }
        .btn { transition: transform 0.3s ease, box-shadow 0.3s ease; }
        .btn:hover { transform: scale(1.05); box-shadow: 0 0 15px rgba(255, 215, 0, 0.5); }
        footer { background: rgba(0, 0, 0, 0.9); border-top: 1px solid #FFD700; animation: fadeIn 2s ease-in forwards; }
        input { background: #333; color: #fff; border: 1px solid #FFD700; border-radius: 5px; padding: 0.5rem; width: 100%; }
        label { color: #FFD700; font-weight: bold; }
    </style>
</head>
<body>
<!-- Navigation Bar -->
<nav class="navbar p-4 flex justify-between items-center fixed top-0 w-full z-10">
    <div class="text-4xl font-extrabold text-[#FFD700] tracking-wide">SportFlow Admin</div>
    <div class="space-x-8">
        <a href="MemberServlet" class="nav-link text-[#FFD700] text-xl font-semibold">Manage Members</a>
        <a href="EntraineurServlet" class="nav-link text-[#FFD700] text-xl font-semibold">Manage Entraineurs</a>
        <a href="SeanceServlet" class="nav-link text-[#FFD700] text-xl font-semibold">Manage Séances</a>
        <a href="Logout" class="nav-link text-[#FFD700] text-xl font-semibold hover:text-red-500">Logout</a>
    </div>
</nav>

<!-- Main Body -->
<main class="flex-grow py-20 mt-16">
    <div class="text-center mb-12">
        <h1 class="text-5xl font-extrabold text-[#FFD700] mb-6 animate-fade-in">Edit Member</h1>
        <p class="text-xl text-gray-300 animate-fade-in" style="animation-delay: 0.5s;">Update member details below.</p>
    </div>
    <div class="form-container mx-auto max-w-lg p-6">
        <form action="EditMemberServlet" method="post">
            <input type="hidden" name="id" value="${member.id}">
            <div class="mb-4">
                <label for="username" class="block mb-2">Username</label>
                <input type="text" id="username" name="username" value="${member.userame}" required placeholder="Enter Username">
            </div>
            <div class="mb-4">
                <label for="email" class="block mb-2">Email</label>
                <input type="email" id="email" name="email" value="${member.email}" required placeholder="Enter Email">
            </div>
            <div class="mb-4">
                <label for="password" class="block mb-2">Password</label>
                <input type="password" id="password" name="password" value="${member.password}" required placeholder="Enter Password">
            </div>
            <div class="mb-4">
                <label for="dateNaissance" class="block mb-2">Date of Birth</label>
                <input type="date" id="dateNaissance" name="dateNaissance" value="${member.dateNaissance}" required>
            </div>
            <div class="mb-4">
                <label for="sport" class="block mb-2">Sport</label>
                <input type="text" id="sport" name="sport" value="${member.sport}" required placeholder="Enter Sport">
            </div>
            <div class="flex justify-end space-x-4">
                <button type="submit" class="btn bg-[#FFD700] text-black font-semibold py-2 px-4 rounded-lg">Save Changes</button>
                <a href="MemberServlet" class="btn bg-gray-500 text-white font-semibold py-2 px-4 rounded-lg">Cancel</a>
            </div>
        </form>
        <c:if test="${not empty errorMessage}">
            <p class="text-red-500 text-center mt-4">${errorMessage}</p>
        </c:if>
    </div>
</main>

<!-- Footer -->
<footer class="p-6 text-center text-gray-400">
    <p>© 2025 SportFlow. Created by <span class="text-[#FFD700] font-semibold">Lahcen Ait Maskour</span>.
        Images by <a href="https://unsplash.com" class="text-[#FFD700] hover:text-[#e6c200]">Unsplash</a>.</p>
</footer>

<!-- Security Check -->
<%
    jakarta.servlet.http.HttpSession sessionCheck = request.getSession(false);
    if (sessionCheck == null || sessionCheck.getAttribute("user") == null || !"admin".equals(sessionCheck.getAttribute("user"))) {
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>