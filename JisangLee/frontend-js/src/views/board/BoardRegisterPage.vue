<template>
    <div align="center">
        <h2>상품 등록</h2>
        <board-register-form @submit="onSubmit"/>
    </div>
</template>

<script>

import BoardRegisterForm from '@/components/board/BoardRegisterForm.vue'
import axios from 'axios'

export default {
    name: 'BoardRegisterPage',
    components: {
        BoardRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { product, shop, information, price } = payload
            axios.post('http://localhost:7777/48th/vueboard/register', { product, shop, information, price })
                    .then(() => {
                        alert('상품 등록 성공!')

                        this.$router.push({
                            name: 'BoardListPage'
                        })
                    })
                    .catch(() => {
                        alert('문제 발생!')
                    })
        }
    }
}

</script>
