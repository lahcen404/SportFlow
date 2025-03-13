<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Member.Model.Member" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Member Dashboard - SportFlow</title>
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
            color: #ffffff;
            font-family: 'Arial', sans-serif;
        }
        .dashboard-container {
            max-width: 1200px;
            margin: 2rem auto;
            padding: 2rem;
            background: #000000;
            border: 3px solid #FFD700;
            border-radius: 15px;
            box-shadow: 0 0 25px rgba(255, 215, 0, 0.4);
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
        .btn-danger {
            background: #ff4444;
            color: #ffffff;
            font-weight: bold;
            transition: background 0.3s ease;
        }
        .btn-danger:hover {
            background: #cc0000;
        }
        input:focus, select:focus {
            outline: none;
            border-color: #FFD700;
            box-shadow: 0 0 5px #FFD700;
        }
    </style>
</head>
<body>
<%
    // Check if user is logged in and is a Member
    Member member = (Member) session.getAttribute("user");
    if (member == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<div class="dashboard-container">
    <!-- Header -->
    <h1 class="text-4xl font-bold text-center text-[#FFD700] mb-8 animate-slide-in">Welcome, <%= member.getUserame() %>!</h1>

    <!-- Navigation Tabs -->
    <div class="flex justify-center space-x-6 mb-10">
        <button id="sessionsTab" class="p-3 btn-gold rounded-lg">View My Sessions</button>
        <button id="profileTab" class="p-3 btn-outline rounded-lg">Modify Profile</button>
        <button id="deleteTab" class="p-3 btn-danger rounded-lg">Delete Account</button>
    </div>

    <!-- Sessions Section -->
    <div id="sessionsSection" class="space-y-6 animate-fade-in">
        <h2 class="text-2xl font-semibold text-[#FFD700] mb-4">My Training Sessions</h2>
        <p class="text-gray-300">Here you can view your scheduled training sessions.</p>
        <!-- Placeholder for session list -->
        <div class="bg-[#1a1a1a] p-4 rounded-lg border border-[#FFD700]">
            <p class="text-gray-400">No sessions available yet. Check back later or contact your Entraineur!</p>
        </div>
        <!-- Add real session data here via servlet or DAO -->
    </div>

    <!-- Profile Modification Section -->
    <div id="profileSection" class="space-y-6 hidden animate-fade-in">
        <h2 class="text-2xl font-semibold text-[#FFD700] mb-4">Modify Your Profile</h2>
        <form action="UpdateMember" method="post" class="space-y-5">
            <div>
                <label for="username" class="block text-[#FFD700] font-semibold">Username</label>
                <input type="text" id="username" name="username" value="<%= member.getUserame() %>"
                       class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>
            <div>
                <label for="email" class="block text-[#FFD700] font-semibold">Email</label>
                <input type="email" id="email" name="email" value="<%= member.getEmail() %>"
                       class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>
            <div>
                <label for="password" class="block text-[#FFD700] font-semibold">Password</label>
                <input type="password" id="password" name="password" value="<%= member.getPassword() %>"
                       class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>
            <div>
                <label for="dateNaissance" class="block text-[#FFD700] font-semibold">Date of Birth</label>
                <input type="date" id="dateNaissance" name="dateNaissance" value="<%= member.getDateNaissance() %>"
                       class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>
            <div>
                <label for="sport" class="block text-[#FFD700] font-semibold">Sport</label>
                <input type="text" id="sport" name="sport" value="<%= member.getSport() %>"
                       class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
            </div>
            <input type="hidden" name="id" value="<%= member.getId() %>">
            <input type="submit" value="Update Profile" class="w-full p-3 btn-gold rounded-lg cursor-pointer">
        </form>
    </div>

    <!-- Delete Account Section -->
    <div id="deleteSection" class="space-y-6 hidden animate-fade-in">
        <h2 class="text-2xl font-semibold text-[#FFD700] mb-4">Delete Your Account</h2>
        <p class="text-gray-300">Are you sure you want to delete your account? This action cannot be undone.</p>
        <form action="DeleteMember" method="post" onsubmit="return confirm('Are you sure you want to delete your account?');">
            <input type="hidden" name="id" value="<%= member.getId() %>">
            <input type="submit" value="Delete Account" class="w-full p-3 btn-danger rounded-lg cursor-pointer">
        </form>
    </div>

    <!-- Logout Button -->
    <div class="text-center mt-10">
        <a href="Logout" class="p-3 btn-outline rounded-lg">Logout</a>
    </div>
</div>

<!-- JavaScript for Tab Switching -->
<script>
    const sessionsTab = document.getElementById('sessionsTab');
    const profileTab = document.getElementById('profileTab');
    const deleteTab = document.getElementById('deleteTab');
    const sessionsSection = document.getElementById('sessionsSection');
    const profileSection = document.getElementById('profileSection');
    const deleteSection = document.getElementById('deleteSection');

    function showSection(sectionToShow) {
        [sessionsSection, profileSection, deleteSection].forEach(section => {
            section.classList.add('hidden');
        });
        sectionToShow.classList.remove('hidden');
    }

    sessionsTab.addEventListener('click', () => showSection(sessionsSection));
    profileTab.addEventListener('click', () => showSection(profileSection));
    deleteTab.addEventListener('click', () => showSection(deleteSection));

    // Show sessions by default
    showSection(sessionsSection);
</script>
</body>
</html>