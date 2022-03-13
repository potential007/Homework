<template>
    <form @submit.prevent="onSubmit">
        <table>
            <tr>
                <td>상품</td>
                <td>
                    <input type="text" v-model="product"/>
                </td>
            </tr>
            <tr>
                <td>판매처</td>
                <td>
                    <input type="text" v-model="shop"/>
                </td>
            </tr>
            <tr>
                <td>정보</td>
                <td>
                    <textarea cols="50" rows="20" v-model="information">
                    </textarea>    
                </td>
            </tr>
            <tr>
                <td>가격</td>
                <td>
                    <input type="text" v-model="price"/>
                </td>
            </tr>
    </table>

        <div>
            <button type="submit">등록</button>
            <router-link :to="{ name: 'BoardListPage' }">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>

export default {
    name: 'BoardRegisterForm',
    data () {
        return {
            product: '상품을 입력하세요.',
            shop: '너님',
            information: '정보를 입력하세요.',
            price: '가격을 입력하세요'
        }
    },
    methods: {
        onSubmit () {
            const { product, shop, information, price } = this
            this.$emit('submit', { product, shop, information, price })
        }
    }
}
</script>