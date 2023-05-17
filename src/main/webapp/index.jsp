<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="resources/theme/css/style.css">
<link rel="shortcut icon" href="resources/theme/image/logo.png"
	type="image/x-icon">

<title>Banco PAN</title>
</head>
<body>
	<div class="box">
		<form action="">
			<fieldset>
				<legend>
					<b>Login</b>
				</legend>
				<br>
				<div class="inputbox">
					<input type="cpf" name="cpf" id="cpf" class="inputUser2" required>
					<label for="cpf" class="labelinput2">CPF</label>
				</div>
				<br>
				<br>
				<div class="inputbox">
					<input type="password" name="password" id="password"
						class="inputUser2" required> <label for="password"
						class="labelinput2">Senha</label>
				</div>
				<br> <a href="pages/cadastro.jsp">Não tenho cadastro</a> <br>
				<br>
				<button type="submit2" name="submit2" id="submit2">
					<a href="pages/menu.jsp">Entrar</a>
				</button>

			</fieldset>
		</form>
	</div>

</body>
</html>