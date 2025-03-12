<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - SportFlow</title>
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
        .register-container {
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
            position: relative;
        }
        .role-image {
            width: 100%;
            height: 100%;
            object-fit: cover;
            transition: opacity 0.5s ease;
        }
        input:focus, select:focus {
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
<div class="register-container">
    <!-- Form Section -->
    <div class="form-section">
        <h2 class="text-4xl font-bold text-center text-[#FFD700] mb-8 animate-slide-in">Join SportFlow</h2>
        <form id="registerForm" action="Register" method="post" class="space-y-5">
            <!-- Role Selection -->
            <div class="animate-slide-in" style="animation-delay: 0.1s;">
                <label for="role" class="block text-[#FFD700] font-semibold text-lg">I am a:</label>
                <select id="role" name="role" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg focus:border-[#FFD700]" required>
                    <option value="" disabled selected>Select your role</option>
                    <option value="member">Member</option>
                    <option value="entraineur">Entraineur</option>
                </select>
            </div>

            <!-- Common Fields -->
            <div id="commonFields" class="space-y-5">
                <div class="animate-slide-in" style="animation-delay: 0.2s;">
                    <label for="username" class="block text-[#FFD700] font-semibold">Username</label>
                    <input type="text" id="username" name="username" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
                </div>
                <div class="animate-slide-in" style="animation-delay: 0.3s;">
                    <label for="email" class="block text-[#FFD700] font-semibold">Email</label>
                    <input type="email" id="email" name="email" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
                </div>
                <div class="animate-slide-in" style="animation-delay: 0.4s;">
                    <label for="password" class="block text-[#FFD700] font-semibold">Password</label>
                    <input type="password" id="password" name="password" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg" required>
                </div>
            </div>

            <!-- Member-specific Fields -->
            <div id="memberFields" class="space-y-5 hidden">
                <div class="animate-slide-in" style="animation-delay: 0.5s;">
                    <label for="dateNaissance" class="block text-[#FFD700] font-semibold">Date of Birth</label>
                    <input type="date" id="dateNaissance" name="dateNaissance" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg">
                </div>
                <div class="animate-slide-in" style="animation-delay: 0.6s;">
                    <label for="sport" class="block text-[#FFD700] font-semibold">Sport</label>
                    <input type="text" id="sport" name="sport" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg">
                </div>
            </div>

            <!-- Entraineur-specific Fields -->
            <div id="entraineurFields" class="space-y-5 hidden">
                <div class="animate-slide-in" style="animation-delay: 0.5s;">
                    <label for="specialite" class="block text-[#FFD700] font-semibold">Specialty</label>
                    <input type="text" id="specialite" name="specialite" class="w-full p-3 bg-[#1a1a1a] text-white border border-[#FFD700] rounded-lg">
                </div>
            </div>

            <!-- Buttons -->
            <div class="space-y-4">
                <div class="animate-slide-in" style="animation-delay: 0.7s;">
                    <input type="submit" value="Register" class="w-full p-3 btn-gold rounded-lg cursor-pointer">
                </div>
                <div class="flex justify-between animate-slide-in" style="animation-delay: 0.8s;">
                    <a href="index.jsp" class="w-1/2 mr-2 p-3 btn-outline text-center rounded-lg">Back to Home</a>
                    <a href="login.jsp" class="w-1/2 ml-2 p-3 btn-outline text-center rounded-lg">Login</a>
                </div>
            </div>
        </form>
    </div>

    <!-- Image Section -->
    <div class="image-section">
        <img id="memberImage" src="https://images.unsplash.com/photo-1517836357463-d25dfeac3438?q=80&w=2070&auto=format&fit=crop"
             alt="Member" class="role-image hidden animate-fade-in">
        <img id="entraineurImage" src="https://images.unsplash.com/photo-1593079831268-3381b0db4a77?q=80&w=2069&auto=format&fit=crop"
             alt="Entraineur" class="role-image hidden animate-fade-in">
    </div>
</div>

<!-- JavaScript for dynamic field and image switching -->
<script>
    const roleSelect = document.getElementById('role');
    const memberFields = document.getElementById('memberFields');
    const entraineurFields = document.getElementById('entraineurFields');
    const memberImage = document.getElementById('memberImage');
    const entraineurImage = document.getElementById('entraineurImage');

    roleSelect.addEventListener('change', function() {
        if (this.value === 'member') {
            // Show Member fields and image
            memberFields.classList.remove('hidden');
            entraineurFields.classList.add('hidden');
            memberImage.classList.remove('hidden');
            entraineurImage.classList.add('hidden');
            // Make Member fields required
            document.getElementById('dateNaissance').required = true;
            document.getElementById('sport').required = true;
            document.getElementById('specialite').required = false;
        } else if (this.value === 'entraineur') {
            // Show Entraineur fields and image
            memberFields.classList.add('hidden');
            entraineurFields.classList.remove('hidden');
            memberImage.classList.add('hidden');
            entraineurImage.classList.remove('hidden');
            // Make Entraineur fields required
            document.getElementById('dateNaissance').required = false;
            document.getElementById('sport').required = false;
            document.getElementById('specialite').required = true;
        } else {
            // Hide all fields and images
            memberFields.classList.add('hidden');
            entraineurFields.classList.add('hidden');
            memberImage.classList.add('hidden');
            entraineurImage.classList.add('hidden');
        }
    });
</script>
</body>
</html>