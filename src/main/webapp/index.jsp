<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SportFlow - Home</title>
    <!-- Tailwind CSS CDN -->
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        /* Custom Animations */
        @keyframes bounceIn {
            0% { transform: scale(0.8); opacity: 0; }
            60% { transform: scale(1.05); opacity: 1; }
            100% { transform: scale(1); }
        }
        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }
        @keyframes rotateBorder {
            0% { border-color: #FFD700; }
            50% { border-color: #e6c200; }
            100% { border-color: #FFD700; }
        }
        body {
            background: linear-gradient(135deg, rgba(0, 0, 0, 0.7), rgba(26, 26, 26, 0.7)),
            url('https://i.pinimg.com/736x/39/cd/68/39cd68e6225948f8124fd72b8f5e1052.jpg') no-repeat center center fixed;
            background-size: cover;
            color: #ffffff;
            font-family: 'Arial', sans-serif;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
        .navbar {
            background: #000000;
            border-bottom: 4px solid transparent;
            border-image: linear-gradient(to right, #FFD700, #e6c200) 1;
            box-shadow: 0 4px 15px rgba(255, 215, 0, 0.2);
        }
        .nav-link {
            transition: color 0.3s ease;
        }
        .nav-link:hover {
            color: #e6c200;
        }
        .card {
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            animation: bounceIn 1s ease-out forwards;
        }
        .card:hover {
            transform: scale(1.1) rotate(2deg);
            box-shadow: 0 0 30px rgba(255, 215, 0, 0.7);
            border-color: #e6c200;
            animation: rotateBorder 2s infinite;
        }
        .hero-text {
            animation: fadeIn 1.5s ease-in forwards;
        }
        .about-section {
            background: rgba(0, 0, 0, 0.8);
            border: 2px solid #FFD700;
            border-radius: 10px;
        }
        footer {
            background: rgba(0, 0, 0, 0.9);
            border-top: 1px solid #FFD700;
            animation: fadeIn 2s ease-in forwards;
        }
    </style>
</head>
<body>
<!-- Navigation Bar -->
<nav class="navbar p-4 flex justify-between items-center fixed top-0 w-full z-10">
    <div class="text-4xl font-extrabold text-[#FFD700] tracking-wide">SportFlow</div>
    <div class="space-x-8">
        <a href="index.jsp" class="nav-link text-[#FFD700] text-xl font-semibold">Home</a>
        <a href="MainRegister.jsp" class="nav-link text-[#FFD700] text-xl font-semibold">Register</a>
        <a href="login.jsp" class="nav-link text-[#FFD700] text-xl font-semibold">Login</a>
    </div>
</nav>

<!-- Main Body -->
<main class="flex-grow py-20 mt-16">
    <!-- Hero Section -->
    <div class="text-center mb-16">
        <h1 class="text-6xl font-extrabold text-[#FFD700] mb-8 hero-text">Welcome to SportFlow</h1>
        <p class="text-xl text-gray-300 mb-12 hero-text" style="animation-delay: 0.5s;">
            Your ultimate platform for sports training and coaching excellence.
        </p>
        <div class="flex justify-center space-x-12">
            <!-- Member Card -->
            <a href="register.jsp?role=member" class="card bg-[#1a1a1a] border-2 border-[#FFD700] rounded-xl p-6 w-72" style="animation-delay: 0.8s;">
                <img src="https://images.unsplash.com/photo-1517836357463-d25dfeac3438?q=80&w=2070&auto=format&fit=crop"
                     alt="Member" class="w-full h-48 object-cover rounded-lg mb-4">
                <h3 class="text-3xl font-bold text-[#FFD700]">Member</h3>
                <p class="text-gray-400 mt-2">Train like a champion.</p>
            </a>
            <!-- Entraineur Card -->
            <a href="register.jsp?role=entraineur" class="card bg-[#1a1a1a] border-2 border-[#FFD700] rounded-xl p-6 w-72" style="animation-delay: 1s;">
                <img src="https://images.unsplash.com/photo-1593079831268-3381b0db4a77?q=80&w=2069&auto=format&fit=crop"
                     alt="Entraineur" class="w-full h-48 object-cover rounded-lg mb-4">
                <h3 class="text-3xl font-bold text-[#FFD700]">Entraineur</h3>
                <p class="text-gray-400 mt-2">Lead with expertise.</p>
            </a>
        </div>
    </div>

    <!-- About Section -->
    <div class="about-section mx-auto max-w-4xl p-8 mb-16">
        <h2 class="text-4xl font-bold text-[#FFD700] text-center mb-8 animate-fade-in">About SportFlow</h2>
        <div class="grid grid-cols-1 md:grid-cols-2 gap-8">
            <div class="animate-fade-in" style="animation-delay: 0.2s;">
                <img src="https://images.unsplash.com/photo-1552674605-db6ffd4facb5?q=80&w=2070&auto=format&fit=crop"
                     alt="Training" class="w-full h-40 object-cover rounded-lg mb-4">
                <h3 class="text-2xl font-semibold text-[#FFD700]">For Members</h3>
                <p class="text-gray-300">Connect with top trainers, track your progress, and dominate your sport.</p>
            </div>
            <div class="animate-fade-in" style="animation-delay: 0.4s;">
                <img src="https://images.unsplash.com/photo-1607962837359-5e7e89f86776?q=80&w=2070&auto=format&fit=crop"
                     alt="Coaching" class="w-full h-40 object-cover rounded-lg mb-4">
                <h3 class="text-2xl font-semibold text-[#FFD700]">For Entraineurs</h3>
                <p class="text-gray-300">Manage sessions, inspire athletes, and build your legacy.</p>
            </div>
        </div>
    </div>
</main>

<!-- Footer -->
<footer class="p-6 text-center text-gray-400">
    <p>© 2025 SportFlow. Created by <span class="text-[#FFD700] font-semibold">Lahcen Ait Maskour</span>. Images by <a href="https://unsplash.com" class="text-[#FFD700] hover:text-[#e6c200]">Unsplash</a>.</p>
</footer>
</body>
</html>