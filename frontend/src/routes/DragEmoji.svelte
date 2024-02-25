<script>
	export let left = 200;
	export let top = 200;
	let moving=false;

	function start() {
		moving = true;
	}

	function stop() {
		moving = false;
	}

	function move(e) {
		if (moving) {
			left += e.movementX;
			top += e.movementY;
		}
	}
	
</script>

<style>
	.dragemoji {
		user-select: none;
		position: absolute;
		cursor: move;
	}
</style>

<svelte:window on:mouseup={stop} on:mousemove={move}/>

<section on:mousedown={start} style="left: {left}px; top: {top}px;" class="dragemoji">
	<slot></slot>
</section>