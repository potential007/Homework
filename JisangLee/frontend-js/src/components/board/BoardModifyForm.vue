<template>
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>상품 번호</td>
                    <td>
                        <input type="text" :value="board.boardNo" disabled/>
                    </td>
                </tr>
                <tr>
                <td>상품</td>
                <td>
                    <input type="text" v-model="product"/>
                </td>
        
                <tr>
                <td>판매처</td>
                <td>
                    <input type="text" v-model="board.shop" disabled/>
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
                    <input type="text" v-model="price">
                </td>
                </tr>
            </table>

            <div>
                <button type="submit">수정 완료</button>
                <router-link :to="{ name: 'BoardReadPage', 
                                    params: { boardNo: board.boardNo.toString() } }">
                    취소
                </router-link>
            </div>
        </form>
    </div>
</template>

<script>

export default {
    name: 'BoardModifyForm',
    props: {
        board: {
            type: Object,
            required: true
        }
    },
    data () {
        return {
            product: '',
            information: '',
            price: ''
        }
    },
    methods: {
        onSubmit () {
            const { product, information, price } = this
            this.$emit('submit', {  product, information, price })
        }
    },
    created () {
        this.product = this.board.product
        this.information = this.board.information
        this.price = this.board.price
    }
}
</script>