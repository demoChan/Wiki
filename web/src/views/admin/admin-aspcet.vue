<template>
    <div :style="{ background: '#fff', padding: '50px', margin: 0}">
        <a-radio-group v-model:value="value" >
            <a-radio :value="1">计算机领域</a-radio>
            <a-radio :value="2">航空领域</a-radio>
            <a-radio :value="3">医学领域</a-radio>
        </a-radio-group>
    </div>
</template>
<script lang="ts">
    import { defineComponent, ref } from 'vue';
    export default defineComponent({
        setup() {
            const value = ref<number>(1);
            return {
                value,
            };
        },
    });
</script>

