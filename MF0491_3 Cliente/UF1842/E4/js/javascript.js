/*factorial de un numero sacando el valor introducido por pantalla del DOM*/

function factorial (){
	var factorial = 1;
        for (var i=1; i <= document.getElementById ('n').value; i++){
            factorial *= i;
        }
        document.getElementById ('resultado').value = factorial;
}

/*winamp*/
const Webamp = window.Webamp;
        new Webamp({
           availableSkins:[
            {url: "./skins/Green-Dimension-V2.wsz", name:"Green Dimension V2" },
            {url: "./skins/AmigaPPC-dark.wsz", name:"AmigaPPC dark" },
            {url: "./skins/base-2.91.wsz", name:"base 2.91" },
            {url: "./skins/base-2.91-png.wsz", name:"base 2.91 png" },
            {url: "./skins/Internet-Archive.wsz", name:"Internet Archive" },
            {url: "./skins/MacOSXAqua1-5.wsz", name:"MacOSXAqua1-5" },
            {url: "./skins/Skinner_Atlas.wsz", name:"Skinner Atlas" },
            {url: "./skins/Sonic_Attitude.wsz", name:"Sonic Attitude" },
            {url: "./skins/TopazAmp1-2.wsz", name:"TopazAmp 1.2" },
            {url: "./skins/Vizor1-01.wsz", name:"Vizor 1.01" },
            {url: "./skins/XMMS-Turquoise.wsz", name:"XMMS Turquoise" },
            {url: "./skins/ZaxonRemake1-0.wsz", name:"ZaxonRemake 1.0" },
            ],
           initialTracks:[
           {url: "./music/llama-2.91.mp3"},
           ],
            initialSkin: 
            {url: "./skins/MacOSXAqua1-5.wsz"}    
        }).renderWhenReady(document.getElementById('mp'));
        