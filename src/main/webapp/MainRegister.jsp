<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - SportFlow</title>
    <!-- Tailwind CSS CDN -->
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        /* Custom animations */
        @keyframes slideIn {
            from { transform: translateY(20px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }
        .animate-slide-in {
            animation: slideIn 0.5s ease-out forwards;
        }
        body {
            background: linear-gradient(135deg, #000000 0%, #1a1a1a 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .form-container {
            background: #000000;
            border: 2px solid #FFD700;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(255, 215, 0, 0.3);
        }
        input:focus, select:focus {
            outline: none;
            border-color: #FFD700;
            box-shadow: 0 0 5px #FFD700;
        }
    </style>
</head>
<body>
<div class="form-container p-8 w-full max-w-md text-white">
    <h2 class="text-3xl font-bold text-center text-[#FFD700] mb-6 animate-slide-in">Join SportFlow</h2>
    <form id="registerForm" action="Register" method="post" class="space-y-4">
        <!-- Role Selection -->
        <div class="animate-slide-in" style="animation-delay: 0.1s;">
            <label for="role" class="block text-[#FFD700] font-semibold">I am a:</label>
            <select id="role" name="role" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded focus:border-[#FFD700]" required>
                <option value="" disabled selected>Select your role</option>
                <option value="member">Member</option>
                <option value="entraineur">Entraineur</option>
            </select>
        </div>

        <!-- Common Fields -->
        <div id="commonFields" class="space-y-4">
            <div class="animate-slide-in" style="animation-delay: 0.2s;">
                <label for="username" class="block text-[#FFD700] font-semibold">Username</label>
                <input type="text" id="username" name="username" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded" required>
            </div>
            <div class="animate-slide-in" style="animation-delay: 0.3s;">
                <label for="email" class="block text-[#FFD700] font-semibold">Email</label>
                <input type="email" id="email" name="email" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded" required>
            </div>
            <div class="animate-slide-in" style="animation-delay: 0.4s;">
                <label for="password" class="block text-[#FFD700] font-semibold">Password</label>
                <input type="password" id="password" name="password" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded" required>
            </div>
        </div>

        <!-- Member-specific Fields -->
        <div id="memberFields" class="space-y-4 hidden">
            <div class="animate-slide-in" style="animation-delay: 0.5s;">
                <label for="dateNaissance" class="block text-[#FFD700] font-semibold">Date of Birth</label>
                <input type="date" id="dateNaissance" name="dateNaissance" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded">
            </div>
            <div class="animate-slide-in" style="animation-delay: 0.6s;">
                <label for="sport" class="block text-[#FFD700] font-semibold">Sport</label>
                <input type="text" id="sport" name="sport" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded">
            </div>
        </div>

        <!-- Entraineur-specific Fields -->
        <div id="entraineurFields" class="space-y-4 hidden">
            <div class="animate-slide-in" style="animation-delay: 0.5s;">
                <label for="specialite" class="block text-[#FFD700] font-semibold">Specialty</label>
                <input type="text" id="specialite" name="specialite" class="w-full p-2 bg-[#1a1a1a] text-white border border-[#FFD700] rounded">
            </div>
        </div>

        <!-- Submit Button -->
        <div class="animate-slide-in" style="animation-delay: 0.7s;">
            <input type="submit" value="Register" class="w-full p-3 bg-[#FFD700] text-black font-bold rounded hover:bg-[#e6c200] transition duration-300 cursor-pointer">
        </div>
    </form>
</div>

<!-- JavaScript for dynamic field switching -->
<script>
    const roleSelect = document.getElementById('role');
    const memberFields = document.getElementById('memberFields');
    const entraineurFields = document.getElementById('entraineurFields');

    roleSelect.addEventListener('change', function() {
        if (this.value === 'member') {
            memberFields.classList.remove('hidden');
            entraineurFields.classList.add('hidden');
            // Make Member fields required
            document.getElementById('dateNaissance').required = true;
            document.getElementById('sport').required = true;
            document.getElementById('specialite').required = false;
        } else if (this.value === 'entraineur') {
            memberFields.classList.add('hidden');
            entraineurFields.classList.remove('hidden');
            // Make Entraineur fields required
            document.getElementById('dateNaissance').required = false;
            document.getElementById('sport').required = false;
            document.getElementById('specialite').required = true;
        } else {
            memberFields.classList.add('hidden');
            entraineurFields.classList.add('hidden');
        }
    });
</script>
</body>
</html>