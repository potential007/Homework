<template>
    <div>
        <table>
            <tr>
                <td>게시물 번호</td>
                <td>
                    <input type="text" :value="board.boardNo" readonly/>
                </td>
            </tr>
             <tr>
                <td>상품</td>
                <td>
                    <input type="text" v-model="board.product" readonly/>
                </td>
            </tr>
            <tr>
                <td>판매처</td>
                <td>
                    <input type="text" v-model="board.shop" readonly/>
                </td>
            </tr>
            <tr>
                <td>정보</td>
                <td>
                    <textarea cols="50" rows="20" v-model="board.information" readonly>
                    </textarea>    
                </td>
            </tr>
            <tr>
                <td>가격</td>
                <td>
                    <input type="text" v-model="board.price" readonly/>
                </td>
            </tr>
        </table>
    </div>
</template>

<script>

export default {
    name: 'BoardRead',
    props: {
        board: {
            type: Object,
            required: true
        }
    }
}
</script>