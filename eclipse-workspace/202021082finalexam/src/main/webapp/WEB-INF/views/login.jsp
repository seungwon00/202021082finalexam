<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
</head>
<body>
    <h1>로그인</h1>
    <form action="/login" method="post">
        <label for="username">아이디:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <button type="submit">로그인</button>
    </form>
    <a href="/signup">회원가입</a>
</body>
</html>
