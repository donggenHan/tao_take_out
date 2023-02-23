//获取所有地址
function addressListApi() {
    return $axios({
      'url': '/addressBook/list',
      'method': 'get',
    })
  }


//查询单个地址
function addressFindOneApi(id) {
  return $axios({
    'url': `/addressBook/${id}`,
    'method': 'get',
  })
}

