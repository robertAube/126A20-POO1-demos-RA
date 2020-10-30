@ECHO OFF
if [%1]==[] goto Erreur
set all="%*"
@ECHO ON
echo ************
git add *
echo ************
git commit -m %all%
echo ************
git push -u origin --all
@ECHO OFF
GOTO Fin
:Erreur
echo Indiquez en argument la raison de la mise à jour
echo Ne pas mettre d'accent et de guillemets! 
echo Exemple:
echo pushAll.bat Nouvelle mise à jour des commentaires et du script push
:Fin
echo ************
git status
PAUSE
