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

<title>BANCO PAN</title>
</head>
<body>
	<div class="box">
		<form action="">
			<fieldset>
				<legend>
					<b>Cadastro</b>
				</legend>
				<br>
				<div class="inputbox">
					<input type="text" name="nome" id="nome" class="inputUser" required>
					<label for="nome" class="labelinput">Nome Completo</label>
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
				<p>Sexo</p>
				<input type="radio" id="feminino" name="genero" value="feminino"
					required> <label for="feminino">Feminino</label> <input
					type="radio" id="masculino" name="genero" value="masculino"
					required> <label for="masculino">Masculino</label> <input
					type="radio" id="outro" name="genero" value="outro" required>
				<label for="outro">Outro</label> <br>
				<br>
				<div class="inputbox">
					<label for="data_nascimento"><b>Data de Nascimento: </b></label> <input
						type="date" name="data_nascimento" id="data_nascimento" required>
					<br>
					<br>
					<div class="inputbox">
						<input type="text" name="cidade" id="cidade" class="inputUser"
							required> <label for="cidade" class="labelinput">Cidade</label>
					</div>
					<br>
					<div class="inputbox">
						<input type="tel" name="endereco" id="endereco" class="inputUser"
							required> <label for="endereco" class="labelinput">Endereço</label>
					</div>
					<br>
					<div class="inputbox">
						<input type="password" name="password" id="password"
							class="inputUser" required> <label for="password"
							class="labelinput">Senha</label>
					</div>
					<br>
					<button type="submit" name="submit" id="submit">
						<a href="../index.jsp">Enviar</a>
					</button>
			</fieldset>
		</form>
	</div>

</body>
</html>