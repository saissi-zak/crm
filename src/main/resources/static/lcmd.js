
function addlcmd(){
	
	var prix=$("#prix").val();
	var qte=$("#qte").val();
	var mnt=$("#mnt").val();
	var total =parseFloat(mnt)+(parseFloat(qte)*parseFloat(prix));
	var totalLigne =parseFloat(qte)*parseFloat(prix);
	var product=$("#art").val();
	
	$("#mnt").val(total);
	$("#detcmd").append("<tr><td><input type='hidden' th:field='${lcmd.prd}' th:value='"+product+"' name='prd'>"+product +"</td><td><input type='hidden' th:field='${lcmd.quantite}' th:value='"+qte+"' name='quantite'>"+qte +"</td><td><input type='hidden' th:field='${lcmd.prix}' th:value='"+prix+"' name='prix'>"+prix +"</td><td><input type='hidden'  th:value='"+totalLigne+"' name='prd'>"+totalLigne +"</td><input type='hidden' th:field='${lcmd.cmd}'  name='cmd'>");
	
 
	
}