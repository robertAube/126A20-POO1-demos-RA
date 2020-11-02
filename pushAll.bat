@ECHO OFF
cls
if [%1]==[] goto Erreur
set all="%*"
echo ************
@ECHO ON
git add *
@ECHO OFF
echo ************
@ECHO ON
git commit -m %all%
@ECHO OFF
echo ************
@ECHO ON
git push -u origin --all
@ECHO OFF
GOTO Fin
:Erreur
echo Indiquez en argument la raison de la mise à jour
echo Ne pas mettre d'accent et de guillemets! 
echo Exemple:
echo pushAll.bat Nouvelle mise à jour des commentaires et du script push
:Fin
@ECHO OFF
echo ************
@ECHO ON
git status
@ECHO OFF
PAUSE
