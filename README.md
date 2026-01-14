Work In Progress 1.20.1 Rewrite of Traincraft


to build use the gradlew build command

<img src="https://github.com/Mrjam22/Traincraft-1.20.1/blob/1.20.1-rewrite/Screenshot.png?raw=true">

<h1> Why Rewrite </h1>

between 1.7.10 and 1.20.1 there are 9 years worth of changes in minecraft and the modding space. 
there are multiple mod loaders. forge, fabrcmc and quiltmc 
a modern version of the mod needs to be built for cross mod-loader development 

there is also the 1.13 addition of datapacks and now in 1.20.1 alot of stuff such as, Crafting Recipes, Loot Tables, Block/Item/Entity/etc Tags,Advancements,Some World Gen and more. so alot of crafting recipes will need to be rewriten in json.
Block Models are done in json since 1.8 and lot of blocks in traincraft use custom obj model renderers that will need to be.

This work in progress version uses Architectury API on forge and Architectury API + Special Model Loader("https://www.curseforge.com/minecraft/mc-mods/special-model-loader") for Fabricmc/Quiltmc.
