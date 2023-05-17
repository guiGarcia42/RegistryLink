<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="../resources/theme/css/style.css" rel="stylesheet">
<link href="../resources/theme/image/logo.png" rel="shortcut icon"
	type="image/x-icon">

<title>Banco PAN</title>
</head>
<body>
	<div class="box">
		<form action="">
			<fieldset>
				<legend>
					<b>Confirmação de Dados</b>
				</legend>
				<br>
				<div class="inputbox">
					<input type="nome" name="nome" id="nome" class="inputUser" required>
					<label for="nome" class="labelinput">Nome</label>
				</div>
				<br>
				<div class="inputbox">
					<input type="cpf" name="cpf" id="cpf" class="inputUser" required>
					<label for="cpf" class="labelinput">CPF</label>
				</div>
				<br>
				<div class="inputbox">
					<input type="text" name="email" id="email" class="inputUser"
						required> <label for="email" class="labelinput">E-mail</label>
				</div>
				<br>
				<div class="inputbox">
					<input type="tel" name="telefone" id="telefone" class="inputUser"
						required> <label for="telefone" class="labelinput">Telefone</label>
				</div>
				<br>
				<br>
				<button type="submit" name="submit" id="submit">
					<a href="./contratar.jsp">Enviar</a>
				</button>

			</fieldset>
		</form>
	</div>


</body>
</html>