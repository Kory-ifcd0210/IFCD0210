/*winamp*/
const Webamp = window.Webamp;
        new Webamp({
           availableSkins:[
            {url: "./skins/Vizor1-01.wsz", name:"Vizor 1.01" },
            ],
           initialTracks:[
           {url: "./music/RoundtableRival_LindseyStirling.mp3"},
           {url:"./music/TheArena_LindseyStirling.mp3"},
           {url:"./music/Radioactive_LindseyStirling_Pentatonix.mp3"},
           ],
            initialSkin: 
            {url: "./skins/Vizor1-01.wsz"}    
        }).renderWhenReady(document.getElementById('mp'));
        
