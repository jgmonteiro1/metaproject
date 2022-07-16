import axios from 'axios';
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request';

import './style.css'

type Props = {
    saleId: number;
}

function handleClick(saleId : number){
    axios(`${BASE_URL}/sales/notification/${saleId}`)
    .then(response =>{
        toast.info(`Enviou mensagem para o id: ${saleId}`);
    })
}

function NotificationButton({saleId} : Props) {
    return (
        <div className="dsmeta-red-btn" onClick={ () => handleClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton
