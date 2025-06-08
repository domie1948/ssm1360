
var projectName = '家政服务网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '家政资讯',
	url: './pages/jiazhengzixun/list.jsp'
}, 
{
	name: '家政服务',
	url: './pages/jiazhengfuwu/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspmen24b/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"服务类型","menuJump":"列表","tableName":"fuwuleixing"}],"menu":"服务类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"家政类型","menuJump":"列表","tableName":"jiazhengleixing"}],"menu":"家政类型管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"家政评价","menuJump":"列表","tableName":"jiazhengpingjia"}],"menu":"家政评价管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"家政资讯","menuJump":"列表","tableName":"jiazhengzixun"}],"menu":"家政资讯管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"家政服务","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"家政预约","menuJump":"列表","tableName":"jiazhengyuyue"}],"menu":"家政预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"家政资讯列表","menuJump":"列表","tableName":"jiazhengzixun"}],"menu":"家政资讯模块"},{"child":[{"buttons":["查看","家政预约"],"menu":"家政服务列表","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","修改"],"menu":"家政评价","menuJump":"列表","tableName":"jiazhengpingjia"}],"menu":"家政评价管理"},{"child":[{"buttons":["查看","删除","支付","家政评价"],"menu":"家政预约","menuJump":"列表","tableName":"jiazhengyuyue"}],"menu":"家政预约管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"家政资讯列表","menuJump":"列表","tableName":"jiazhengzixun"}],"menu":"家政资讯模块"},{"child":[{"buttons":["查看","家政预约"],"menu":"家政服务列表","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
