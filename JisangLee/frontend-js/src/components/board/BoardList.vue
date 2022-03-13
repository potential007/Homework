<template>
    <div>
        <h3>상품 목록</h3>
        <table border="1">
            <tr>
            <th align="center" width="50">번호</th>
            <th align="center" width="200">상품</th>
            <th align="center" width="100">판매처</th>
            <th align="center" width="200">정보</th>
            <th align="center" width="100">가격</th>
            </tr>
            <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
                <td colspan="5">
                    현재 등록된 상품이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="board in boards" :key="board.boardNo">
                <td align="center">
                    {{ board.boardNo }}
                </td>
               <td align="center">
                    <router-link :to="{ name: 'BoardReadPage', 
                                        params: { boardNo: board.boardNo.toString() } }">
                        {{ board.product }}
                    </router-link>
                <td align="center">
                    {{ board.shop }}
                </td>
                <td align="center">
                    {{ board.information }}
                </td>
                <td align="center">
                    {{ board.price }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>

export default {
    name: 'BoardList',
    props: {
        boards: {
            type: Array
        }
    },
    beforeUpdate () {
        console.log('check: ' + this.boards)
    }
}

</script>