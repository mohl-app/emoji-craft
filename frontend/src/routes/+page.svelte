<script>
	import DragEmoji from './DragEmoji.svelte';
</script>

<div id="wrapper">
    <div id="header">
        <h1>Emoji Craft</h1>
    </div>
    <div id="canvas">
		</div>
    <div id="sidebar">
        <span class="emoji" on:dblclick={() => alert('hi')}>🙂</span>
        <span class="emoji">🙁</span>
        <span class="emoji">😤</span>
        <span class="emoji">😐</span>
    </div>
</div>

<DragEmoji>
	<h1>
		🙂
	</h1>
</DragEmoji>

<style>
    #wrapper {
        background-color: #222;
        display: grid;
        grid-template-columns: 4fr 1fr;
        grid-template-rows: 6rem 1fr;
        grid-template-areas: "header header" "canvas sidebar";
        height: 100vh;
    }

    #header {
        color: #ddd;
        grid-area: header;
        margin: auto;
    }

    #canvas {
        color: #ddd;
        grid-area: canvas;
        background-color: #222;
        border: #ddd 1px solid;
        height: 100%;
    }

    #sidebar {
        color: #ddd;
        grid-area: sidebar;
        background-color: #222;
        border: #ddd 1px solid;
        height: 100%;
    }
    .emoji {
        font-size: 4rem;
        padding: .5rem;
    }
</style>