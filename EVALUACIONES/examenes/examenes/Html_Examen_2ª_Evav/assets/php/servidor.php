<?php
require_once("BBDD_CTRLR.php");

//                                                                                               CUANDO SE MUESTRAN LOS DEPORTISTAS
if (isset($_REQUEST['peticion'])) {
    switch ($_REQUEST['peticion']) {
        case "cargar_animales":
            $sql = "SELECT DISTINCT cat_id, cat_nombre FROM categorias ORDER BY cat_nombre";
            $datos = BBDD_CTRLR::Consultas($sql);
            echo json_encode($datos);
            break; 
        case "ver_animales":
            $ANIMALES = $_REQUEST['ANIMALES'];
            $sql = "SELECT DISTINCT foto_foto, foto_cat_id
            FROM fotos
            WHERE `foto_cat_id` = '$ANIMALES'
            ORDER BY foto_cat_id";
            $datos = BBDD_CTRLR::Consultas($sql);
            echo json_encode($datos);
            break;
    }        
}

