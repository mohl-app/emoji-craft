<div id="wrapper">
    <div id="header">
        <h1>Header</h1>
    </div>
    <div id="canvas">
        <h2>Canvas</h2>
        <p>Content goes here</p>
    </div>
    <div id="sidebar">
        <h3>Sidebar</h3>
        <p>Sidebar goes here</p>
    </div>
</div>

<style>
    #wrapper {
        background-color: #111;
        display: grid;
        grid-template-columns: 4fr 1fr;
        grid-template-rows: 100px 1fr;
        grid-template-areas: "header header" "canvas sidebar";
        height: 100vh;
    }

    #header {
        color: #eee;
        grid-area: header;
    }

    #canvas {
        color: #eee;
        grid-area: canvas;
        background-color: #111;
        border: black 1px solid;
        height: 100%;
    }

    #sidebar {
        color: #eee;
        grid-area: sidebar;
        background-color: #111;
        height: 100%;
    }
</style>